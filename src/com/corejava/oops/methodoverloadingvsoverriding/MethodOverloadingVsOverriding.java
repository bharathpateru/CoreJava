package com.corejava.oops.methodoverloadingvsoverriding;

class A {
    void print(int a) {
        System.out.println("A-int");
    }
}

class B extends A {
    void print(long a) {
        System.out.println("B-long");
    }
}

public class MethodOverloadingVsOverriding {
    public static void main(String[] args) {
        A obj = new B();
        obj.print(10);
    }
}