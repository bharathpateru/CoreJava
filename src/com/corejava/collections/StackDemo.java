package com.corejava.collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("stack : "+numbers);

        System.out.println("pop : "+numbers.pop());

        System.out.println("After pop : "+numbers);

        System.out.println("check Top Element in Stack : "+numbers.peek());

        System.out.println("After peek : "+numbers);
    }
}
