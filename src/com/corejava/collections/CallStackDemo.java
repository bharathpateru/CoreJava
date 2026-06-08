package com.corejava.collections;

public class CallStackDemo {

    public static void main(String[] args) {
        methodA();
    }
    static void methodA() {
        System.out.println("A start");
        methodB();
        System.out.println("A end");
    }

    static void methodB() {
        System.out.println("B start");
        methodC();
        System.out.println("B end");
    }

    static void methodC() {
        System.out.println("C executing");
    }
}