package com.corejava.arrays;

import java.util.Arrays;

public class RotateArrayByNTimes {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
       // {5, 1, 2, 3, 4};
        int lastElement = numbers[numbers.length-1];
        System.out.println("Before : "+Arrays.toString(numbers));
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i-1];
        }
        numbers[0]=lastElement;
        System.out.println("After : "+Arrays.toString(numbers));
    }
}
