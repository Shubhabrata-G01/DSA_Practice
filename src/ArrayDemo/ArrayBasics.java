package ArrayDemo;

import java.util.ArrayList;

public class ArrayBasics {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        System.out.println(numbers);
        System.out.println(numbers.length);


        ArrayList<Object> lst = new ArrayList<>();
        lst.add(10);
        lst.add(null);
        lst.add(10);

        System.out.println(lst);
    }
}
