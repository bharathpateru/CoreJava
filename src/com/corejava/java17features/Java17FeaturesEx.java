package com.corejava.java17features;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Java17FeaturesEx {
    public static void main(String[] args) {

        String json = """
        {
          "name": "Bharath",
          "age": 25
        }
        """;
        System.out.println(json);


        String day = "MONDAY";
        int dayNumber = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> 1;
            case "SATURDAY", "SUNDAY" -> 2;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println("Day Group: " + dayNumber);


        String carBrand = "BMW";
        int rankOfCar = switch (carBrand){
            case "TATA", "Mahindra" -> 1;
            case "Toyota", "BMW" -> 2;
            default -> throw new IllegalArgumentException("Invalid Car Brand :" + carBrand);
        };
        System.out.println("Car Rank : "+ rankOfCar);

        record Employee(String name, int age) {}
        Employee e1 = new Employee("Bharath", 33);
        Employee e2 = new Employee("Bharath", 33);

        System.out.println(e1);
        System.out.println("---------------------------------------");
        Map<Employee, Employee> mp = new HashMap<>();
        mp.put(e1, e1);
        mp.put(e2, e2);
        System.out.println(mp);
        Object obj = (Employee) mp.get(e1);
        System.out.println("-------------obj--------------------------");
        System.out.println(obj);

        "helloworld".lines().forEach(System.out::println);



    }
}
