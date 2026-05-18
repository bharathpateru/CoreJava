package com.corejava.arrayproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PossiblePairs {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(4, 5);

        var pairs = numbers1
                .stream()
                .flatMap(i -> numbers2
                        .stream()
                        .map(j -> Arrays.asList(i, j)))
                .collect(Collectors.toList());
       // System.out.println(pairs);
        pairs.stream().forEach(System.out::println);
    }
}
