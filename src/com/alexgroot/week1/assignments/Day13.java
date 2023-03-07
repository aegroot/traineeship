package com.alexgroot.week1.assignments;

public class Day13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean fireActive = i % 3 == 0;
            boolean electricActive = i % 5 == 0;
            System.out.print(i + ":  ");

            if (fireActive && !electricActive) {
                System.out.println("fire");
            } else if (!fireActive && electricActive) {
                System.out.println("electric");
            } else if (fireActive && electricActive) {
                System.out.println("firing mah lazzurrr");
            } else {
                System.out.println("normal");
            }
        }
    }
}
