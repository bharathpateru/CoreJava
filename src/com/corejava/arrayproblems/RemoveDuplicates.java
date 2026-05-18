package com.corejava.arrayproblems;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 2, 4};
        Arrays.sort(arr);

        System.out.println("Array after Sorting :"+Arrays.toString(arr));

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Unique elements are from index 0 to j
        int[] result = Arrays.copyOf(arr, j + 1);

        System.out.println(Arrays.toString(result));
    }
}