package com.alexgroot.week3.Encryption;

import java.util.Arrays;

public class Encryptor {
    public static String encrypt(String input, int key) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] = encryptChar(chars[i], key, 65, 90);
            } else if (chars[i] >= 97 && chars[i] <= 122) {
                chars[i] = encryptChar(chars[i], key, 97, 122);
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
