package com.corejava.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeating {


    public static Character firstNonRepeating(String s) {
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (char c : s.toLowerCase().toCharArray()) {
            if (c != ' ')
                count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }



    public static void main(String[] args) {

        String country="innddiaa";
        Character c1 = FirstNonRepeating.firstNonRepeating(country);
        System.out.println(c1);

        System.out.println("-------------------------");

        // first non-repeating character
        Optional<Character> firstNonRepeating = country
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((entry) -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        firstNonRepeating.ifPresent(System.out::println);
    }
}
