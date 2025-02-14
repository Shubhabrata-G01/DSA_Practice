package ArrayDemo;

public class multiDimentionalArray {
    static int[][] newArray;

    // Sum of Each Row in a Matrix
    public static void sumOfEachRow(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of row-" + (i + 1) + " is: " + sum);
        }
    }

    //Printing a 2D Array

    public static void printMultiDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Problem 1: Transpose of a Matrix (A transpose swaps rows and columns in a matrix.)

    public static void transposeAMatrix(int[][] arr) {
        int i = 0, j = 0;
        newArray = new int[arr[i].length][arr[j].length];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                newArray[i][j] = arr[j][i];
            }
        }
        printMultiDArray(newArray);
    }

    public static void printMultiDArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] aMatrix = {{1, 2, 3}, {45, 56, 67}, {789, 890, 901}};
        int[][] bMatrix = {{1, 2, 3}, {45, 56}, {890}};
        int[][][] cMatrix =
                {{{1, 2, 3}, {45, 56, 67}, {789, 890, 901}},
                        {{4, 5, 6}, {78, 89, 90}, {123, 234, 345}},
                        {{7, 8, 9}, {12, 23, 34}, {456, 567, 678}}};

//        sumOfEachRow(aMatrix);
//        System.out.println("****");
//        sumOfEachRow(bMatrix);
//        printMultiDArray(aMatrix);
//        System.out.println("****");
//        printMultiDArray(bMatrix);
//        System.out.println("****");
//        printMultiDArray(cMatrix);

//        transposeAMatrix(aMatrix);
        transposeAMatrix(bMatrix);

    }
}
