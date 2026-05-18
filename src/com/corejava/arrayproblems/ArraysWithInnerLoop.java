package com.corejava.arrayproblems;

public class ArraysWithInnerLoop {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         */
        ArraysWithInnerLoop.printThreeRowsFiveColumns();

        /*

         *
         **
         ***
         ****

         */
        System.out.println("--------------------------------------------------------");
        ArraysWithInnerLoop.printIncreasingOrder();

        /*

        1 2 3
        1 2 3
        1 2 3

         */
        System.out.println("--------------------------------------------------------");
        ArraysWithInnerLoop.printNumbers();


        /*

        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25

         */
        System.out.println("--------------------------------------------------------");
        ArraysWithInnerLoop.printMultipleUptoFive();



    }

    private static void printMultipleUptoFive() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }

    private static void printNumbers() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }

    private static void printIncreasingOrder() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j< i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void printThreeRowsFiveColumns() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
