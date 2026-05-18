package com.corejava.arrays;

import java.util.Arrays;

public class RotateArrayByNTimes {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
       // {5, 1, 2, 3, 4};
        System.out.println("Before : "+Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[numbers.length  -i];
        }
        System.out.println("After : "+Arrays.toString(numbers));
    }
}
