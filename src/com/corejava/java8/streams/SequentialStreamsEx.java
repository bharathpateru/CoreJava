package com.corejava.java8.streams;

import java.util.Arrays;
import java.util.stream.LongStream;

public class SequentialStreamsEx {
    public static void main(String[] args) {
        long[] numbers = new long[20000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        long startTime = System.currentTimeMillis();
        long sequentialSum = Arrays.stream(numbers).map(SequentialStreamsEx::findFactorial).sum();
        long endTime = System.currentTimeMillis();

        System.out.println("sum : "+sequentialSum);
        System.out.println("Time taken to process : "+ (endTime - startTime) + " ms");
    }
    private static long findFactorial(long num) {
        return LongStream.range(1, num).reduce(1, (long a, long b)->a*b);
    }

}
