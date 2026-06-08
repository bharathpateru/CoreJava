package com.corejava.strings;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountVowelsAndConstants {
    public static void main(String[] args) {
        String str = "Hello World";
        // a,e,i,o,u are vowels
        int vowelsCount = 0, constantsCount = 0;
        for (Character ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowelsCount++;
                } else {
                    constantsCount++;
                }
            }
        }
        System.out.println("Vowels Count is : " + vowelsCount);
        System.out.println("Constants count is : " + constantsCount);
        System.out.println("-----------------------");

        Map<Boolean, Long> vowelsConsonantsCount = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy(c -> Character.isLetter(c) && "aeiou".indexOf(c) != -1, Collectors.counting()));
        System.out.println(vowelsConsonantsCount);

    }
}
