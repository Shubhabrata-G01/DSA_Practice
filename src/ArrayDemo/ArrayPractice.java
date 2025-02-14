package ArrayDemo;

public class ArrayPractice {
    public static int findMaxNumberInAnArray(int[] arr) {
        int max = 0;
        for (int i : arr)
            if (i > max)
                max = i;
        return max;
    }

    public static void reverseAnArray(int[] arr) {
        int len = arr.length;//6
        int[] newArr = new int[len];
        for (int i = arr.length - 1; i >= 0; i--)//5,4,3,2,1,0
            newArr[len - 1 - i] = arr[i];
        for (int j : newArr)
            System.out.print(j + ", ");
    }

    public static int linearSearch(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == value) {
                index = i;
            }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 213, 57, 92, 117};

//        System.out.println(findMaxNumberInAnArray(arr));
//        reverseAnArray(arr);
        System.out.println(linearSearch(arr, 57));
        System.out.println(linearSearch(arr, 54));
    }
}
