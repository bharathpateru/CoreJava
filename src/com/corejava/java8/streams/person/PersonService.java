package com.corejava.java8.streams.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonService {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Adam", 34, "Finance"),
                new Person("Kevin", 12, "IT"),
                new Person("Daniel", 77, "HR"),
                new Person("Ana", 56, "IT"),
                new Person("Joe", 31, "Finance")
        );

        var result = personList.stream().collect(Collectors.groupingBy(Person::getDepartment));
        //System.out.println(result);

        Map<String, List<String>> collect = personList.stream().collect(Collectors.groupingBy(Person::getDepartment,
                Collectors.mapping(Person::getName, Collectors.toList())));

        System.out.println(collect);

        personList.stream().collect(Collectors.groupingBy(Person::getName ,Collectors.toList()));
        List<Integer> numbers = Arrays.asList(2,4,7,3,1,6,8);
        System.out.println("-------------------------------");
        numbers.stream().reduce(Integer::max).ifPresent(System.out::println);


    }
}
