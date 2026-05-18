package com.corejava.threads.executorsservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerTask implements Runnable{

    private String name;
    public WorkerTask(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("Task started :"+name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task Finished :"+name);
    }
}

public class ExecutorServiceEx {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new WorkerTask("Task1"));
        es.submit(new WorkerTask("Task2"));
        es.submit(new WorkerTask("Task3"));

        es.shutdown();
    }
}
