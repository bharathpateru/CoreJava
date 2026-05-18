package com.corejava.oops.collectionframework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(2,1,3,5,4);

        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        //System.out.println(sortedList);

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(null,1);
        mp.put(null,2);

        System.out.println(mp.get(null));

    }
}
