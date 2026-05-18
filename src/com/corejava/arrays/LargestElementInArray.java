package com.corejava.arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 7, 56, 90};

        int largestElement = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(largestElement<numbers[i]){
                largestElement = numbers[i];
            }
        }
        System.out.println(largestElement);
    }
}
