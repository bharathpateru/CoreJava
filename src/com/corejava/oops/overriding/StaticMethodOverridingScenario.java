package com.corejava.oops.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
       protected void process() throws Exception {
        System.out.println("Protected process");
    }
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void process() {
        System.out.println("public process");
    }
    static void show() {
        System.out.println("Child");
    }
}

public class StaticMethodOverridingScenario {
    public static void main(String[] args) throws Exception {

        Parent p = new Child();
        p.show();
        p.process();
    }
}
