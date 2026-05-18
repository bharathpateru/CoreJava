package com.corejava.interview;

public class Test {
    public static void main(String[] args) {


        String[] names = {"a", "b", "c", "d", "e"};
        int length = names.length;
        int middle = length / 2;
        String extracted = extracted(names, middle);
        System.out.println(extracted);
    }

    private static String extracted(String[] names, int middle) {
        for (int i = 0; i < names.length; i++) {
            if (middle == i) {
                {
                    return names[i];
                }
            }
        }
        return "";
    }
}
