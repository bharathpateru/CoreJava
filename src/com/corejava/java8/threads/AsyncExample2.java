package com.corejava.java8.threads;

import java.util.concurrent.CompletableFuture;

public class AsyncExample2 {
    public static void main(String[] args) throws Exception {

        CompletableFuture<Integer> future =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("Calculating...");
                    try { Thread.sleep(2000); } catch (Exception ignored) {}
                    return 10;
                });

        System.out.println("Doing other work...");

        int result = future.get();  // blocking only at the end

        System.out.println("Result = " + result);
    }
}