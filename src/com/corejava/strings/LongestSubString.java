package com.corejava.strings;

import java.util.HashSet;
import java.util.Set;
interface i{
   public static final int x=10;
}class ert implements i{
    void show(){
       int x=20;
        System.out.println(x);
    }
}
public class LongestSubString {
    public static void main(String[] args) {

        ert e = new ert();
        e.show();

        /*
        Input: "abcabcbb"
        Output: "abc"
         */
        String logestSubString = LongestSubString.longestSubstring("abcabcbb");
        System.out.println(logestSubString);
    }
    public static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }
        return s.substring(start, start + maxLen);
    }
}
