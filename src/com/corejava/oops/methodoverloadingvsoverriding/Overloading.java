package com.corejava.oops.methodoverloadingvsoverriding;

class Overloading {


    void show(Integer x) {
        System.out.println("Integer");
    }

    void show(long x) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.show(10);
    }
}