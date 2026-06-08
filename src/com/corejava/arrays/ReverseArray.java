package com.corejava.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before : " + Arrays.toString(numbers));
        System.out.println("Array Length : " + numbers.length);
        int reversedArray[] = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedArray[i] = numbers[i];
            // System.out.println("i------> "+i);
        }
        System.out.println("After : " + Arrays.toString(reversedArray));

    }
}
