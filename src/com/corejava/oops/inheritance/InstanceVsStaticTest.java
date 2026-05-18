package com.corejava.oops.inheritance;

class A {
    static void m1() {
        System.out.println("static A");
    }
    void m2() {
        System.out.println("instance A");
    }
}

class B extends A {
    static void m1() {
        System.out.println("static B");
    }
    void m2() {
        System.out.println("instance B");
    }
}

public class InstanceVsStaticTest {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
        a.m2();
    }
}
