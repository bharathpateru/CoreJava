import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        String s = "aabcdeefg";
        Optional<Character> firstNonReaptingChar = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter((entry) -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        firstNonReaptingChar.ifPresent(System.out::println);
        /*
         */

        String s1 = "aaabcdeefg";
        HashMap<Character, Integer> hm = new LinkedHashMap<>();

        String[] strArray = s1.split("");
        for (char c : s1.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (hm.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }

        String str = "aaabcdeefg";
        Optional<Character> first = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
        first.ifPresent(System.out::println);
    }
}