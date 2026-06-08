package com.corejava.arrayproblems;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondThirdLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {5,2,3,7,1,8};

        Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder()).skip(0)
                .findFirst().ifPresent(System.out::println);

    }
}
