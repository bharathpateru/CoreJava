package com.corejava.oops.overriding;


class Alpha {
    Object getValue() {
        return "A";
    }
}

class Beta extends Alpha {
    String getValue() {
        return "B";
    }
}

public class MethodOverridingEx2 {
    public static void main(String[] args) {
        Alpha a = new Beta();
        System.out.println(a.getValue());
    }
}
