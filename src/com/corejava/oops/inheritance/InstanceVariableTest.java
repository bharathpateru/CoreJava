package com.corejava.oops.inheritance;

class AA {
    int x = 10;
}

class BB extends AA {
    int x = 20;

}

public class InstanceVariableTest {
    public static void main(String[] args) {
        AA a = new BB();
        System.out.println(a.x);
    }
}