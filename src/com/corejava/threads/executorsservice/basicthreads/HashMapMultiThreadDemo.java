package com.corejava.threads.executorsservice.basicthreads;

import java.util.HashMap;
import java.util.Map;

public class HashMapMultiThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Map<Integer, Integer> map = new HashMap<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("HashMap size: " + map.size());


    }
}