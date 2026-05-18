package com.corejava.arrayproblems;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int length = numbers.length;
        System.out.println(length);
        int[] reversedArray = new int[length];

        for (int i = numbers.length-1; i >=0 ; i--) {
            reversedArray[numbers.length-1-i] = numbers[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
