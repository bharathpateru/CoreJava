package com.corejava.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EasyLevelArrayProblems {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        int sum = EasyLevelArrayProblems.sumGivenArray(numbers);
        System.out.println("Sum of Given Array: "+sum);

        int largestElement = EasyLevelArrayProblems.findLargestElement(numbers);
        System.out.println("Largest Element in a given Array : "+largestElement);

        int EvenElementsCount = EasyLevelArrayProblems.findEvenElementCount(numbers);
        System.out.println("Count of Even numbers in a given Array : "+EvenElementsCount);

        int[] reversedArray = EasyLevelArrayProblems.reverseGivenArray(numbers);
        System.out.println("Reverse of Given array is :"+ Arrays.toString(reversedArray));

        boolean isArraySorted = EasyLevelArrayProblems.checkeArraySortedDescending(numbers);
        System.out.println("numbers sorted in descending order : "+isArraySorted);

        int CountOfOccurrenceOfEle = EasyLevelArrayProblems.countOccurrenceOfGivenElement(numbers, 3);
        System.out.println("3 occured "+CountOfOccurrenceOfEle+" times");

        Set<Integer> uniqueNumbers = EasyLevelArrayProblems.findUniqueNumbers(numbers);
        System.out.println("Unique numbers in a Given Array : "+ uniqueNumbers);
        
        int secondLargest = EasyLevelArrayProblems.findSecondLargest(numbers);
        System.out.println("Second Largest number is : "+secondLargest);

        int[] new_numbers = {6,7,8,9,10};
        int[] mergedArray = EasyLevelArrayProblems.mergeSortedArrays(numbers, new_numbers);
        System.out.println("Merged Array is : "+Arrays.toString(mergedArray));
        int[] nums = {0,-1,0,-3,6,7,8,9,10};
    }
    private static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0;
        for (int k = 0; k < mergedArray.length; k++) {

            if(i<array1.length && j<array2.length){
                if (array1[i]<=array2[j]){
                    mergedArray[k] = array1[i++];
                }else{
                    mergedArray[k] = array1[j++];
                }
            } else if (i<array1.length) {
                mergedArray[k] = array1[i++];
            }else {
                mergedArray[k] = array2[j++];
            }

        }
        return mergedArray;
    }

    private static int findSecondLargest(int[] numbers) {

        if (numbers.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;

    }

    private static Set<Integer> findUniqueNumbers(int[] numbers) {

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : numbers) {
            if (!unique.add(n)) {
                duplicates.add(n);
            }
        }
        unique.removeAll(duplicates);
        return unique;
    }

    private static int countOccurrenceOfGivenElement(int[] numbers, int num) {
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==num){
                count++;
            }
        }
        return count;
    }

    private static boolean checkeArraySortedDescending(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]<numbers[i+1]){
                return false;
            }
        }
        return true;
    }

    private static int[] reverseGivenArray(int[] numbers) {
        int[] reversedArray = new int[numbers.length];
        for (int i = numbers.length-1; i >=0 ; i--) {
            reversedArray[numbers.length-1-i] = numbers[i];
        }
        return reversedArray;
    }

    private static int findEvenElementCount(int[] numbers) {
        int evenelementCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                evenelementCount++;
            }
        }
        return evenelementCount;
    }

    private static int sumGivenArray(int[] numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        return sum;
    }

    private static int findLargestElement(int[] numbers) {
        int large= numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>large){
                large=numbers[i];
            }
        }
        return large;
    }

}
