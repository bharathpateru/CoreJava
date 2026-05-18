package com.corejava.java8.fi;

interface MaxFinder{
    int max(int a, int b);
}
public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        MaxFinder maxFinder = (a,b)-> (a > b) ? a : b;
        System.out.println(maxFinder.max(5,6));
        System.out.println(maxFinder.max(10,6));
    }
}
