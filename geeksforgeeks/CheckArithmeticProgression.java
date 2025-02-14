public class CheckArithmeticProgression {
    public static boolean checkAP(int[] arr) {
        boolean isAP = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[0] + (i) * (arr[i] - arr[i - 1])) {
                isAP = true;
            } else {
                isAP = false;
            }
        }
        return isAP;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 10, 13, 16, 19};
        int[] arr2 = {1, 4, 7, 10, 13, 16, 20};

        System.out.println("is arr1 in AP? " + checkAP(arr1));
        System.out.println("is arr2 in AP? " + checkAP(arr2));

    }
}
