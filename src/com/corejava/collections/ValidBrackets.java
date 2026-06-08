package com.corejava.collections;

import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        String input = "{[{}]}";
        System.out.println(isValid(input)); // true
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ']' && top != '[') ||
                        (ch == ')' && top != '(')
                        || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}