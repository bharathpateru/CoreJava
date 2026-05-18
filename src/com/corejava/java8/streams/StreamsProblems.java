package com.corejava.java8.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsProblems {
    public static void main(String[] args) {
        /*
            Given a sentence, find the word that has the highest length
        */

        String str = "I am learning streams API in java";
        String highestLengthWord = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(highestLengthWord);

        /*
        Remove duplicates and print in the same order.
         */

        String s = "dabcadefg";
        s.chars().mapToObj(c -> (char) c).distinct().forEach(System.out::print); ;
        System.out.println("------------------------------------------------------");
        int[] numbers = {1,2,3,4,5,6,7,8};
        Map<Boolean, List<Integer>> evenOdd = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.toList()));
        System.out.println(evenOdd);

        Optional<Character> firstNonRepeatingChar = s.chars().mapToObj((c) -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((enntry) -> enntry.getValue() == 1).map(Map.Entry::getKey).findFirst();

        firstNonRepeatingChar.ifPresent(System.out::println);


        Set<Map.Entry<Character, Long>> entries = s.chars().mapToObj((c) -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet();

        for (Map.Entry<Character, Long> entry: entries){
            System.out.println(entry.getKey() + "--------" + entry.getValue());
        }


        s.chars().mapToObj((c) -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((enntry) -> enntry.getValue() == 1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);

    }
}
