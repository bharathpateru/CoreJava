package com.corejava.arrayproblems;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0,1,0,3,12};
        int index =0;
        for (int num: numbers){
            if(num!=0){
                numbers[index++]=num;
            }
        }
        while (index< numbers.length){
            numbers[index++]=0;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
