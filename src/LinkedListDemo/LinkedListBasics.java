package LinkedListDemo;

import java.util.LinkedList;

public class LinkedListBasics {

    public static void main(String[] args) {

        LinkedList nums = new LinkedList();
        nums.add(10);
        nums.add(10);
        nums.add(10);
        Object[] arr = nums.toArray();

        System.out.println(nums);
        System.out.println(arr.toString());

    }
}
