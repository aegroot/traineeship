package com.alexgroot.deel1.week4;

public class mathclass {
    public static void main(String[] args) {
        int exp = exponent(9, 2);
        System.out.println(exp);
    }

    public static int exponent(int base, int exp) {
        int tempBase = base;

        for (int i = 1; i < exp; i++) {
            tempBase *= base;
        }
        return tempBase;
    }
}
