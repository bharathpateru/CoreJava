package com.corejava.oops.methodoverloadingvsoverriding;

class Parents {
    static void show() {
        System.out.println("Parent");
    }
}

class Childs extends Parents {
    static void show() {
        System.out.println("Child");
    }
}

public class StaticOverriding {
    public static void main(String[] args) {
        Parents obj = new Childs();
        obj.show();
    }
}