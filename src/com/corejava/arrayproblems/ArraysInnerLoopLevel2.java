package com.corejava.arrayproblems;

public class ArraysInnerLoopLevel2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        /*
        10 20
        10 30
        20 30
         */
        ArraysInnerLoopLevel2.printPossiblePairs(numbers);
        System.out.println("--------------------------------------------");

        int[] array1 = {10, 15, 20, 5};
        int target = 25;
        int count = ArraysInnerLoopLevel2.findNumberPairsGreaterThanTarget(array1, target);
        System.out.println("Count of Pairs where sum of pair greater than 25 : " + count);
    }

    private static int findNumberPairsGreaterThanTarget(int[] array1, int target) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] + array1[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void printPossiblePairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}
