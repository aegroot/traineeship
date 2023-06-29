package com.alexgroot.deel1.week3.Encryption;


public class Decryptor {
    public static String decrypt(String input, int key) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = decryptChar(chars[i], key, 'a', 'z');
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = decryptChar(chars[i], key, 'A', 'Z');
            }
        }
        return String.valueOf(chars);
    }

    public static char decryptChar(char c, int key, int begin, int end) {

        if (c < begin || c > end) {
            return c;
        }

        if (c - key < begin) {
            return (char) (c - key + end - begin + 1);
        } else return (char) (c - key);
    }

}
