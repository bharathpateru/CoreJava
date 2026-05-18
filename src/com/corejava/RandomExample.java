package com.corejava;

import java.util.random.RandomGenerator;

public class RandomExample {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.of("L128X1024MixRandom");

        for (int i = 0; i < 5; i++) {
            System.out.println(generator.nextInt(1000));
        }
    }
}