package com.alexgroot.deel1.week8;

import java.util.Random;

public class Day48 {
    public static void main(String[] args) {
        System.out.println(coinfFlip());
    }

    public static double randomDouble(int max) {
        return new Random().nextDouble() * max;
    }

    public static String randomString(String... strings) {
        return strings[(new Random().nextInt()) * strings.length];
    }

    public static boolean coinfFlip(double d) {
        return new Random().nextDouble() < d;
    }

    public static boolean coinfFlip() {
        return coinfFlip(0.5);
    }

}
