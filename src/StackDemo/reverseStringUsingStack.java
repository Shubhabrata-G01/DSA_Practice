package StackDemo;

import java.util.Stack;

public class reverseStringUsingStack {

    public static void reverseString(String str) {
        Stack<Character> stackChar = new Stack<>();
        char[] c = str.toCharArray();
        String reverse = "";
        for (int i = 0; i < c.length; i++) {
            stackChar.push(c[i]);
        }
        while (!stackChar.empty()) {
            reverse = reverse + stackChar.pop();
        }

        System.out.println(reverse);
    }

    public static void main(String[] args) {

        reverseString("bappaganguly");
    }
}
