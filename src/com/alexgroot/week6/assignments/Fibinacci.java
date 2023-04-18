package com.alexgroot.week6.assignments;

public class Fibinacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));

    }

    public static int fibonacci(int n) {
        int y = 1, z = 1;
        for (int i = 3; i <= n; i++) {
            int tempres = y + z;
            y = z;
            z = tempres;
        }
        return z;
    }
}
