package com.corejava.threads.executorsservice;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerWithBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producerThread = new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                   // pce.producer(i);
                    queue.put(i);
                    System.out.println("Produced : "+i);
                    Thread.sleep(100);
                }
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                   // pce.consumer();
                    Integer consumedValue = queue.take();
                    System.out.println("Consumed : "+consumedValue);
                    Thread.sleep(100);
                }
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
