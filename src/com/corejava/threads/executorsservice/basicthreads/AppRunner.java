package com.corejava.threads.executorsservice.basicthreads;

public class AppRunner {
    public static void main(String[] args) {
        Runnable r1 = ()->{
            for (int i = 0; i < 10; ++i) {
                System.out.println("Runner1 : " +i);
            }
        };

        Runnable r2 = ()->{
            for (int i = 0; i < 10; ++i) {
                System.out.println("Runner2 : " +i);
            }
        };

        var t1 = new Thread(r1);
        var t2 = new Thread(r2);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        System.out.println("--------------Finished all threads execution--------------");
    }
}
