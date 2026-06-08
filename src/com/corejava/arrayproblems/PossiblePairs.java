package com.corejava.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PossiblePairs {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(4, 5);

        /*
        Java7 way
         */
        List<List<Integer>> combinedList = new ArrayList<>();
        for (int i :  numbers1) {
            for (int j: numbers2) {
                combinedList.add( Arrays.asList(i,j));
            }
        }
        System.out.println(combinedList);
        Stream<Integer> integerStream = combinedList.stream().flatMap(List::stream);
        System.out.println("---------------------"+integerStream);
        combinedList.stream().flatMap(List::stream).forEach(System.out::println);
        System.out.println("---------------------"+integerStream);
        List<Integer> collect = combinedList.stream().flatMap(List::stream).collect(Collectors.toList());

        /*
        Java8 way
         */
        var pairs = numbers1
                .stream()
                .flatMap(i -> numbers2
                        .stream()
                        .map(j -> Arrays.asList(i, j)))
                .collect(Collectors.toList());
        pairs.stream().forEach(System.out::println);



    }
}
