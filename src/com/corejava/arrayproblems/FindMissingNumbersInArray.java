package com.corejava.arrayproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,1,2,5,8};
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        Set<Integer> uniqueNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        List<Integer> missingNumbers = IntStream.rangeClosed(min, max).boxed().filter(num -> !uniqueNumbers.contains(num)).collect(Collectors.toList());
        System.out.println(missingNumbers);


    }
}
