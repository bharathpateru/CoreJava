package com.corejava.strings;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
    public static void main(String[] args) {
        String input = "I am a senior java developer";

        String longest = Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(String::length))
                //.stream().skip(1).findFirst()
                .orElse("");

        System.out.println(longest);



        String secondLargest = Arrays.stream(input.split(" "))
                .distinct() // optional (removes duplicates)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse("Not found");


        System.out.println(secondLargest);
    }
}
