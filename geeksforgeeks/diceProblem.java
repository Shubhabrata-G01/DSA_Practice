import java.util.Scanner;

public class diceProblem {

    public static int oppositeNum(int num) {
        int oppNum;
        if (num > 6 || num < 1) {
            System.out.println("Enter a valid dice number");
            oppNum = -1;
        } else {
            oppNum = 7 - num;
        }
        return oppNum;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = myObj.nextInt();

        System.out.println("Opposite Number is = " + oppositeNum(num));
    }
}
