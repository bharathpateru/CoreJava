package com.corejava.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyLevelSet2 {
    public static void main(String[] args) {
        int[] nums = {0, -1, 0, -3, 6, 7, 8, 9, 10};
        EasyLevelSet2.findCountOfPositiveNegativeZerosFromArray(nums);

        int[] numbers = {1, 2, 3, 4, 5};
        int[] squareArray = EasyLevelSet2.squareArray(numbers);
        System.out.println("After Squaring every element in the Array :" + Arrays.toString(squareArray));

        int countOfElementsGreaterThanAvg = EasyLevelSet2.findCountOfElementsGreaterThanAvg(numbers);
        System.out.println("Count of Elements greater than Avg : " + countOfElementsGreaterThanAvg);
        int[] ns = {1, 2, 3, 4, 5};
        int diffOfMaxAndMin = EasyLevelSet2.findDifferenceOfMaxAndMin(ns);
        System.out.println("Diff between Max and Min is : " + diffOfMaxAndMin);

        int[] newlyCreatedArray = EasyLevelSet2.createArrayUsingFirstAndLastIndex(ns);
        System.out.println("Newly created Array is : " + Arrays.toString(newlyCreatedArray));

        int[] array1 = {2, 3, 2, 4, 2};
        int[] newArray = EasyLevelSet2.removeOccurrencesOfGivenElement(array1, 2);
        System.out.println("Newly created Array is : " + Arrays.toString(newArray));

        int firstEleGreaterThanGivenTarget = EasyLevelSet2.firstEleGreaterThanGivenTarget(ns, 2);
        System.out.println("First Number greater than Given Target : " + firstEleGreaterThanGivenTarget);

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        boolean isBothArraysEqual = EasyLevelSet2.checkIfBothArraysAreEqual(arr1, arr2);
        System.out.println("is both Array are equal : " + isBothArraysEqual);

        int[] arrayWithNegatives = {2, -3, 4, -1};
        int[] arrayWithoutNegatives = EasyLevelSet2.replaceNegativesWithZero(arrayWithNegatives);
        System.out.println("After Removing Negatives : " + Arrays.toString(arrayWithoutNegatives));

        int[] numbersArray = {1, 4, 7, 10, 13};
        int countBetweenTwoElements = EasyLevelSet2.findCountOfElementsBetweenTwoElements(numbersArray, 4, 12);
        System.out.println("Count between two given numbers : " + countBetweenTwoElements);

    }

    private static int findCountOfElementsBetweenTwoElements(int[] numbersArray, int start, int end) {
        int count = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > start && numbersArray[i] < end) {
                count++;
            }
        }
        return count;
    }

    private static int[] replaceNegativesWithZero(int[] arrayWithNegatives) {
        for (int i = 0; i < arrayWithNegatives.length; i++) {
            if (arrayWithNegatives[i] < 0) {
                arrayWithNegatives[i] = 0;
            }
        }
        return arrayWithNegatives;
    }

    private static boolean checkIfBothArraysAreEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        boolean isElementsEqual = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    private static int firstEleGreaterThanGivenTarget(int[] numbers, int tar) {
        int firstGreaterNum = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > tar) {
                firstGreaterNum = numbers[i];
                return firstGreaterNum;
            }
        }
        return firstGreaterNum;
    }

    private static int[] removeOccurrencesOfGivenElement(int[] ns, int num) {
        List<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < ns.length; i++) {
            if (!(num == ns[i])) {
                numsList.add(ns[i]);
            }
        }
        int[] newArray = new int[numsList.size()];
        for (int i = 0; i < numsList.size(); i++) {
            newArray[i] = numsList.get(i);
        }
        return newArray;
    }

    private static int[] createArrayUsingFirstAndLastIndex(int[] ns) {
        int[] newArray = new int[2];
        newArray[0] = ns[0];
        newArray[1] = ns[ns.length - 1];
        return newArray;
    }

    private static int findDifferenceOfMaxAndMin(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return (maxNumber - minNumber);

    }

    private static int findCountOfElementsGreaterThanAvg(int[] numbers) {
        int avg = 0;
        int length = numbers.length;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        avg = sum / length;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg) {
                count++;
            }
        }
        return count;
    }

    private static int[] squareArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }
        return numbers;
    }

    private static void findCountOfPositiveNegativeZerosFromArray(int[] nums) {
        int positiveCount = 0, negativeCount = 0, zerosCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCount++;
            } else if (nums[i] < 0) {
                negativeCount++;
            } else {
                zerosCount++;
            }
        }
        System.out.println("Positive Nos Count :" + positiveCount + ", Negative nos Count : " + negativeCount + ", Zeros Count : " + zerosCount);
    }
}
