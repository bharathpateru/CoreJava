package com.corejava.oops.methodoverloadingvsoverriding;

class Test {
    void show(int... x) {
        System.out.println("varargs");
    }

    void show(int x, int y) {
        System.out.println("fixed");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show(10, 20,30);
    }
}