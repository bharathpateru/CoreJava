package com.corejava.collections;
/*
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors; */

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FirstNonRepeatingCharFromString {
    public static void main(String[] args) {
        String country = "swiss";

        country.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((entry)->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        String str = "java is a programming language";
        Arrays.stream(str.split("")).reduce((a,b)->b+a).ifPresent(System.out::println);


        String reversed = new StringBuilder(
                Arrays.stream(str.split(""))
                        .reduce("", (a, b) -> b + a)
        ).toString();
        System.out.println("-------------------");
        System.out.println(reversed);

    }
}
