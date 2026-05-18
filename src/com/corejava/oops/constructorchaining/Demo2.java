package com.corejava.oops.constructorchaining;

class Animal {
    Animal() {
        System.out.println("Animal()");
    }
    Animal(String type) {
        System.out.println("Animal(String): " + type);
    }
}

class Dog extends Animal {
    Dog() {
        super("Canine");             // must be first line
        System.out.println("Dog()");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        new Dog();
    }
}