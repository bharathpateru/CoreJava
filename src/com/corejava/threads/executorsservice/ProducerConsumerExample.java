package com.corejava.threads.executorsservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

    private static final int QUEUE_SIZE = 5;

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(QUEUE_SIZE);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();
    }
}

// Producer class
class Producer implements Runnable {
    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                String item = "item-" + i;
                queue.put(item); // blocks if full
                System.out.println("Produced: " + item);
                Thread.sleep((long) (Math.random() * 1000));
            }

            // Send termination signal
            queue.put("STOP");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String item = queue.take(); // blocks if empty

                if (item.equals("STOP")) {
                    break;
                }

                System.out.println("Consumed: " + item);
                Thread.sleep((long) (Math.random() * 1500));
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}