package com.corejava.oops.inheritance;

class Dog{
    public void doSound(){
        System.out.println("bark");
    }
}
class Puppy extends Dog{
    public void doSound(){
        System.out.println("bow bow");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Puppy();
        d.doSound();
    }
}
