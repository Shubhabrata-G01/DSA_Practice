package ArrayDemo;

public class ArrayClass {
    int count;
    private int[] arr;

    public ArrayClass(int length) {
        arr = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(arr[i]);
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        } else {
            for (int i = index; i < count; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        }
    }

    public void insert(int value) {
        if (arr.length == count) {
            int[] newArr = new int[count * 2];
            for (int i = 0; i < count; i++)
                newArr[i] = arr[i];
            arr = newArr;
        }

        arr[count++] = value;
    }
}
