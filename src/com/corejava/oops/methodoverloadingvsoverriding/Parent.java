package com.corejava.oops.methodoverloadingvsoverriding;

import java.io.IOException;

class Parent {
    void read() throws Exception {
        System.out.println("Parent read");
    }
}

class Child extends Parent {
    void read() {
        System.out.println("Child read");
    }
}

class MethodOverridingException {
    public static void main(String[] args) throws Exception {
        Parent p = new Child();
        p.read();
    }
}