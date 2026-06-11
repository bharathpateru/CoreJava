package com.corejava.interview;

import java.util.PriorityQueue;

public class NthLargestElement {
    public static void main(String[] args) {
        int[] numbers = {2,1,4,6,3,8,5};
        int n=4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i: numbers){
            pq.add(i);
            if(pq.size()>n){
                pq.poll();
            }

        }
        System.out.println(pq.peek());
    }
}
