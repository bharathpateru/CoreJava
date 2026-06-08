package com.corejava.collections;

import java.util.Stack;

public class ValidBracketsPractice {
    public static void main(String[] args) {
        String brackets = "{[{}]}";

        System.out.println(isValid(brackets));
    }

    public static boolean isValid(String brackets){
        Stack<Character> stackOfBrackets = new Stack<>();
        for (char c: brackets.toCharArray()){
            if (c=='{' || c=='[' || c=='('){
                stackOfBrackets.push(c);
            }else {
               if (stackOfBrackets.isEmpty()) return false;

               char top = stackOfBrackets.pop();

               if (
                       c==']' && top!='[' ||
                       c==')' && top!='(' ||
                       c=='}' && top!= '{'
                        ){
                   return false;
               }

            }
        }
        return stackOfBrackets.isEmpty();
    }

}
