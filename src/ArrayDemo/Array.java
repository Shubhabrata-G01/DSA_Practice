package ArrayDemo;

public class Array {

    int count;
    private int arr[];

    public Array(int length) {
        arr = new int[length];
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
        }
    }

    public void indexOf(int index) {
        for (count = 0; count < arr.length; count++) {
            if (count == index)
                System.out.println(count);
        }
    }

    public void insert(int number) {
        int[] numbers = new int[3];

    }
}
