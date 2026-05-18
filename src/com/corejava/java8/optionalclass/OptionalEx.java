package com.corejava.java8.optionalclass;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Bharath");

        name.ifPresent(System.out::println);

        String value = null;
        Optional<String> s = Optional.of(value);
        Optional<String> value1 = Optional.ofNullable(value);
        Optional.empty();

        System.out.println(value1);
        //System.out.println(value1.orElseThrow(()-> new RuntimeException("Value is not there")));
        System.out.println(Optional.empty());

        String name1 = value1.orElseGet(() -> "Generated");
        //System.out.println(s);

    }
}
