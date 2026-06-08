package com.corejava.oops.methodoverloadingvsoverriding;

class Abc {
    void display() {
        System.out.println("A");
    }
    Abc(){
        System.out.println("----------Abc constructor--------------");
    }
}

class Bbc extends Abc {
    void display() {
        System.out.println("B");
    }

    Bbc(){
        System.out.println("**********Bbc Constructor************");
    }
}

class Cbc {
    public static void main(String[] args) {
        Abc a = new Bbc();
        a.display();
    }
}