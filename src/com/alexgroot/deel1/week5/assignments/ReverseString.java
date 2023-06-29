package com.alexgroot.deel1.week5.assignments;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("resting"));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
