import java.util.Scanner;

public class checkWhetherGivenNumberEvenOdd {

    public static boolean checkWhetherGivenNumberEvenOdd(int number) {
        boolean isEven = false;
        if (number != 0 && number != 1) {
            if ((number % 2) == 0) {
                isEven = true;
            }
        }
        return isEven;
    }

    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = newObj.nextInt();
        System.out.println("Number is: " + number);

        System.out.println("is number an even? " + checkWhetherGivenNumberEvenOdd(number));
    }
}
