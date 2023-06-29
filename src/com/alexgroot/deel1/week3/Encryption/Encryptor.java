package com.alexgroot.deel1.week3.Encryption;

public class Encryptor {
    public static String encrypt(String input, int key) {

        char[] chars = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = encryptChar(chars[i], key, 'a', 'z');
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = encryptChar(chars[i], key, 'A', 'Z');
            }
        }
        return String.valueOf((chars));
    }

    public static char encryptChar(char c, int key, int begin, int end) {
        if (c > end || c < begin) {
            return c;
        }

        if (c + key > end) {
            return (char) (c + key - end + begin - 1);
        } else return (char) (c + key);
    }

}
