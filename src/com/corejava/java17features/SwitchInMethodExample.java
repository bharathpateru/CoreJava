package com.corejava.java17features;

public class SwitchInMethodExample {
    public static void main(String[] args) {
        System.out.println(getSeason(3)); // Output: Spring
    }

    static String getSeason(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }
}