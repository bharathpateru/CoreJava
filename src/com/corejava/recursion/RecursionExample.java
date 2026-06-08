package com.corejava.recursion;

public class RecursionExample {

    public static int factorial(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
