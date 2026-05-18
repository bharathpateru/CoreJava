package com.corejava.strings;

import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // handle multi-digit
            } 
            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = "";
                k = 0;
            } 
            else if (ch == ']') {
                int repeat = countStack.pop();
                String prev = stringStack.pop();

                StringBuilder temp = new StringBuilder(prev);
                for (int i = 0; i < repeat; i++) {
                    temp.append(currentString);
                }

                currentString = temp.toString();
            } 
            else {
                currentString += ch;
            }
        }

        return currentString;
    }
}