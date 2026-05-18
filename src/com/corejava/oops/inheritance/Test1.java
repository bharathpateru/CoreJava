package com.corejava.oops.inheritance;

class Test1 {

    Test1() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Test1();
    }

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block");
    }

}
