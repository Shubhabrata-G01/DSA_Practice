public class findTheNumberClosestToNAndDivisiblebyM {

    public static int findNum(int n, int m) {
        int num;
        if ((n % m) > m / 2)
            num = n + (m - (n % m));
        else
            num = n - (n % m);
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Number is: " + findNum(-15, 6));
    }

}
