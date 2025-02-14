public class swapTwoNumbers {

    public swapTwoNumbers(int a, int b) {
        System.out.println("Initially a= " + a + " and b= " + b);
        int x;
        x = a;
        a = b;
        b = x;

        System.out.println("Finally a= " + a + " and b= " + b);
    }

    public static void swapTwoNumbersWithoutUsingThirdVariable(int p, int q) {
        System.out.println("Initially p= " + p + " and q= " + q);
        p = p - q;
        q = p + q;
        p = q - p;

        System.out.println("Finally p= " + p + " and q= " + q);
    }

    public static void main(String[] args) {
        new swapTwoNumbers(12, 10);
        swapTwoNumbersWithoutUsingThirdVariable(25, 31);
    }
}
