package com.corejava.arrays;

import java.util.Arrays;

public class DecrementElementByOne {
    public static void main(String[] args) {
        int[] numbers = {54,43,2,1,5};
        System.out.println("Before : "+Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= numbers[i]-1;
        }
        System.out.println("After : "+ Arrays.toString(numbers));
    }
}
