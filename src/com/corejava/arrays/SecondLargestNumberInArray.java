package com.corejava.arrays;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10,36, 34, 1};
        //34

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

       for (int num: numbers){
           if (num>firstLargest){ //12>-2147483648
               secondLargest = firstLargest;
               firstLargest = num;
           }else if (num>secondLargest && num!=firstLargest){
               secondLargest = num;
           }
       }
        System.out.println(secondLargest);
    }
}
