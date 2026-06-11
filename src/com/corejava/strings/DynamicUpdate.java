package com.corejava.strings;

import java.util.regex.*;
//import java.util.regex.Pattern;

public class DynamicUpdate {
    public static void main(String[] args) {
        String text = "User alice@domain.com and bob@domain.com need access.";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
        Matcher matcher = pattern.matcher(text);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            String currentEmail = matcher.group();
            // Programmatically decide the new value (e.g., masking the domain)
            String newEmail = currentEmail.replaceAll("@.*", "@newdomain.com");
            matcher.appendReplacement(sb, newEmail);
        }
        matcher.appendTail(sb);

        System.out.println("Result: " + sb.toString());
    }
}
