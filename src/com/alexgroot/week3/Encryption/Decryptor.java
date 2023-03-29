package com.alexgroot.week3.Encryption;


public class Decryptor {
    public static String decrypt(String input, int key) {
        char[] chars = input.toCharArray();


        for (int i = 0; i < input.length(); i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] = decryptChar(chars[i], key, 65, 90);
            } else if (chars[i] >= 97 && chars[i] <= 122) {
                chars[i] = decryptChar(chars[i], key, 97, 122);
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
