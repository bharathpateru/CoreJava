package com.corejava.arrayproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 2, 4};
        Arrays.sort(arr);

        System.out.println("Array after Sorting :"+Arrays.toString(arr));
        //[1, 2, 2, 3, 3, 4]
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

        System.out.println("--------------------------");

        List<Integer> collect = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}