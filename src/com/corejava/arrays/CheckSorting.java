package com.corejava.arrays;

public class CheckSorting {
    public static void main(String[] args) {
       int[] arr = {10, 20, 30, 40, 50};
       boolean isSortedInIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                isSortedInIncreasing = false;
                break;
            }
        }
        System.out.println(isSortedInIncreasing);
    }
}
