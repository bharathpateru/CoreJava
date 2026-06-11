package com.corejava.strings;

import java.util.*;

public class MaxVowelWord {
    public static void main(String[] args) {
        String input = "I am a senior java developer";

        String result = Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(word ->
                        (int) word.toLowerCase()
                                .chars()
                                .filter(ch -> "aeiou".indexOf(ch) != -1)
                                .count()))
                .orElse("Not found");

        System.out.println(result);
    }
}