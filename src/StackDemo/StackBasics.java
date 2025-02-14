package StackDemo;

import java.util.Stack;

public class StackBasics {

    public static void main(String[] args) {
        Stack<Integer> stck = new Stack<>();
        stck.push(10);
        stck.push(20);
        stck.push(30);
        System.out.println(stck);

        var top = stck.pop();
        System.out.println(top);
        System.out.println(stck);

        var peak = stck.peek();
        System.out.println(peak);
        System.out.println(stck);


        var isEmapty = stck.empty();
        System.out.println(isEmapty);
    }
}
