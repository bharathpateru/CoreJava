package com.corejava.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("length : "+numbers.length);
        System.out.println("-----------------------------------");

        Map<Boolean, List<Integer>> collect = Arrays.stream(numbers).boxed().collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.toList()));
        for (Map.Entry<Boolean, List<Integer>> nums: collect.entrySet()){
            System.out.println(nums.getKey() + "----------" + nums.getValue());

        }

    }
}
