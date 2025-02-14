import java.util.Scanner;

public class sumFirstNNaturalNumbers {

    public static int sumFirstNNumbers(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers: ");

        int number = myObj.nextInt();
        System.out.println("Enter number: " + number);

        System.out.println("Sum= " + sumFirstNNumbers(number));
    }
}
