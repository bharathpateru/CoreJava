package com.corejava.oops.methodoverloadingvsoverriding;

class Abc {
    private void display() {
        System.out.println("A");
    }
}

class Bbc extends Abc {
    void display() {
        System.out.println("B");
    }
}
class Cbc {
public static void main(String[] args){
Abc a = new Bbc();
}
}