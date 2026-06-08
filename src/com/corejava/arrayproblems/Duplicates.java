package com.corejava.arrayproblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,3,4,5);

        Set<Integer> duplicates = list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);
        System.out.println("--------------------------");

        Set<Integer> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter((entry) -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(collect);


    }
}