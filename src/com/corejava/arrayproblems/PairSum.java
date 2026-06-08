package com.corejava.arrayproblems;

import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        HashSet<Integer> hs = new HashSet<>();
        for (int num: arr){
            int diff = target-num;
            if (hs.contains(diff)){
                System.out.println("Pair " + num + ", "+ diff);
            }
            hs.add(num);
        }
    }
}
