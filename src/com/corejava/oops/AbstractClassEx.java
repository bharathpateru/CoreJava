package com.corejava.oops;

abstract class Base{
    Base(){
        System.out.println("Base Constructor called");
    }
    abstract void sayHello();
}
class Derieved extends Base{

    Derieved(){
        System.out.println("Derieved Constructor called");
    }
    @Override
    void sayHello() {
        System.out.println("sayHello method called");
    }
}
public class AbstractClassEx {
    public static void main(String[] args) {
        Derieved d = new Derieved();
        d.sayHello();
    }
}
