package com.corejava.threads.executorsservice;

import java.util.List;
import java.util.concurrent.*;

class CallableCl implements Callable<String>{

    private String name;
    public CallableCl(String name){
        this.name = name;
    }
    @Override
    public String call(){
        return "Hi, from Thread " + name;
    }
}

public class ExecutorServiceCallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        //Future<String> welcomeFuture = executorService.submit(new CallableCl("T1"));

        List<CallableCl> callableClList = List.of(new CallableCl("T1"),
                new CallableCl("T2"),
                new CallableCl("T3"));

        List<Future<String>> futureList = executorService.invokeAll(callableClList);
        //String welcomeMessage = welcomeFuture.get();
        for (Future<String> future :futureList) {
            System.out.println(future.get());
        }

        executorService.shutdown();




    }
}
