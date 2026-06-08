package com.corejava.arrays;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {7, 2, 9, 4, 5};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println(k + "rd largest: " + pq.peek());
    }
}