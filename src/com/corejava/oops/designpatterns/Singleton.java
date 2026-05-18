package com.corejava.oops.designpatterns;

public class Singleton {

    private Singleton() {
        System.out.println("Instance created");
    }
    private static class SingletonInner {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInner.INSTANCE;
    }
} class MySingleton{
    public static void main(String[] args) {
        Singleton st1 = Singleton.getInstance();
        Singleton st2 = Singleton.getInstance();
        Singleton st3 = Singleton.getInstance();

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
    }
}
