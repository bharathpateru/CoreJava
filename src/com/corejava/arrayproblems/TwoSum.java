package com.corejava.arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] getTwoSum(int[] numbers, int target){
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i=0; i<numbers.length; i++){
            int compliment = target - numbers[i];
            if(mp.containsKey(compliment)){
                return new int[] {mp.get(compliment), i};
            }else{
                mp.put(numbers[i], i);
            }
        }
        throw new IllegalArgumentException("not found");
    }
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11,  15};
        int target = 9;
        int[] arr = TwoSum.getTwoSum(numbers, target);
        System.out.println(Arrays.toString(arr));
    }
}
