package com.corejava.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String country="swiss";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(country);
        System.out.println("firstNonRepeatingChar is : "+firstNonRepeatingChar);

        Optional<Character> optionalNonRepeating = country.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((entry) -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();

        if(optionalNonRepeating.isPresent()){
            System.out.println("First Non Repeating character is : "+optionalNonRepeating.get());
        }
    }

    private static char findFirstNonRepeatingChar(String country) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch: country.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character, Integer> mp: countMap.entrySet()){
            if(mp.getValue()==1){
                return mp.getKey();
            }
        }
        return '\0';
    }
}
