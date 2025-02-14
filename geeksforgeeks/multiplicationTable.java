import java.util.Scanner;

public class multiplicationTable {

    public static void multiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num * i);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int number = myObj.nextInt();
        System.out.println("Enter a digit: " + number);

        multiplicationTable(number);
    }
}
