package com.corejava.oops.constructorchaining;

class Person {
    String name;
    int age;

    Person() {
        this("Unknown");             // calls Person(String)
        System.out.println("No-arg constructor");
    }

    Person(String name) {
        this(name, 0);               // calls Person(String, int)
        System.out.println("1-arg constructor");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("2-arg constructor");
    }
}

public class Demo {
    public static void main(String[] args) {
        new Person();
    }
}