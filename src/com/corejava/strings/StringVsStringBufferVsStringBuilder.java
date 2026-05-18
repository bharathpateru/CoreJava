package com.corejava.strings;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String s1 = "student1";
        String s2 = new String("student1");
        String s3 = new String("student1");

        System.out.println(s1==s2);
        System.out.println(s3==s2);

        System.out.println(s3.equals(s2));

        String str = new String();
        String str2;

    }
}
