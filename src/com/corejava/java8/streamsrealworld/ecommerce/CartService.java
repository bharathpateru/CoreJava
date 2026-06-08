package com.corejava.java8.streamsrealworld.ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CartService {
    public static void main(String[] args) {
        /*
        Business Scenario
        You work on a shopping cart microservice.

        A User may have an active cart
        A Cart may have cart items
        Each item has price and quantity

        Requirement
        Total cart value per user
        (Exclude users with empty carts)
         */

        List<User> userList = new CartDetailsDao().getCartDetails();
/*
        userList.stream().flatMap(user->user.getCart().stream()
                .flatMap(cart -> cart.getItems().stream())
                .flatMap(List::stream)
                .filter(cartItem -> cartItem!=null)
                .map()
                .collect(Collectors.groupingBy(Map.Entry::getKey, ))
        )
      */
        Map<String, Double> cartValuePerUser = userList.stream()
                .collect(Collectors.toMap(User::getUserId,
                        user -> user.getCart().flatMap(Cart::getItems)
                                .stream().flatMap(List::stream)
                                .mapToDouble(ci -> ci.getPrice() * ci.getQuantity()).sum()));
        //System.out.println(cartValuePerUser);

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        Stream<String> stringStream = listOfLists.stream().flatMap(List::stream);
        System.out.println("------------------------");
        //stringStream.forEach(System.out::println);

        System.out.println();

        List<Emp> empList = List.of(
                new Emp(1,"laxman", Optional.ofNullable(List.of("laxman@gmail.com", "laxmanA@gmail.com"))),
                new Emp(2,"bharath", Optional.ofNullable(null)),
                new Emp(3,"anand", Optional.ofNullable(List.of("anand@gmail.com", "anand123@gmail.com")))
        );

        //empList.stream().forEach(emp -> System.out.println(emp));
        empList.stream().forEach(emp -> {
            //System.out.println(emp.getEmpId());
            //System.out.println(emp.getName());
            //System.out.println(emp.getEmail());
            //System.out.println("----------------------");
        });

         empList.stream()
                .flatMap(emp -> emp.getEmail().stream()).forEach(str-> System.out.println(str));
        System.out.println("----------------------");
        Map<Integer, Integer> collect = empList.stream()
                .collect(Collectors.toMap(emp -> emp.getEmpId(),
                        emp -> emp.getEmail().map(List::size).orElse(0)));
        System.out.println(collect);





    }
}
class Emp{
    private int empId;
    private String name;
    private Optional<List<String>> email;

    public Emp(int empId, String name, Optional<List<String>> email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<List<String>> getEmail() {
        return email;
    }

    public void setEmail(Optional<List<String>> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", email=" + email +
                '}';
    }
}