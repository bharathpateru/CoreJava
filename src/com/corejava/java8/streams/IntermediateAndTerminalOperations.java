package com.corejava.java8.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateAndTerminalOperations {

    static int missingNumber(List<Integer> nums, int n) {
        long expected = (long)n*(n+1)/2;
        long actual = nums.stream().mapToLong(Integer::intValue).sum();
        System.out.println("expected----------> "+expected);
        System.out.println("actual----------> "+actual);
        return (int)(expected - actual);
    }

    public static void main(String[] args) {
        int missingNumber = IntermediateAndTerminalOperations.missingNumber(Arrays.asList(1, 3, 4, 5), 5);

        System.out.println("missingNumber======"+missingNumber);


        List<Integer> numbers = Arrays.asList(1,5,2,6,3,7,2,7,8,2,1,0);

        //Intermediate operations;
        /* Filter */
        System.out.println(" Divisible by 2 ");
        numbers.stream().filter((number)->number%2==0).forEach(System.out::print);
        System.out.println();
        System.out.println("-----------------------------------------------------");
        /* sorted */
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        numbers.stream().map((number)->number*number).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        numbers.stream().filter((number)->number%2==0).map((number)->number+1).forEach(System.out::println);
        numbers.stream().filter((number)->number%2==0).map((number)->number+1).collect(Collectors.toList());

        /* Find first non-repeating character */
        String country="swiss";
        Optional<Character> firstNonRepeatingChar = country
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter((entry) -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();
        System.out.println("First non Repeating character : "+firstNonRepeatingChar.get());
        System.out.println("-----------------------------------------------------");

        long count = Stream.of("A", "B", "C")
                .peek(System.out::print)
                .count();

        System.out.println("count -----> "+count);



        Stream<Integer> s = Stream.of(1,2,3);
        s.forEach(System.out::println);
        try {
            s.forEach(System.out::println);
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------------------------");

        Stream<List<Integer>> str = Stream.of(List.of(1,2), List.of(3,4));



        Map<Boolean, List<Integer>> partition =
                numbers.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        for (Map.Entry<Boolean, List<Integer>> entry: partition.entrySet()){
            System.out.println(entry.getKey() +" --- "+ entry.getValue());
        }

        numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)).entrySet().forEach((entry)->System.out.println(entry.getKey() +" "+ entry.getValue()));

    }
}
