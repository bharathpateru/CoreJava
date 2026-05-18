package com.corejava.arrays;

public class PrintMiddleElementInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int length = numbers.length;
        int middleElement = length / 2;
        int elementAtMiddleIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == middleElement) {
                elementAtMiddleIndex = numbers[i];
            }
        }
        System.out.println("elementAtMiddleIndex is : " + elementAtMiddleIndex);
    }
}
