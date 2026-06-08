package com.corejava.arrayproblems;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()));

        System.out.println(map);
    }
}
