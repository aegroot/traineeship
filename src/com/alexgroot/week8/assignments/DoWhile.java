package com.alexgroot.week8.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int incr = 0;
        int[] list = new int[5];

        do {
            list[incr] = incr + 2;
            incr++;
        }
        while (incr < list.length);

        System.out.println(Arrays.toString(list));
        incr = 0;

        while (incr < list.length) {
            list[incr] = incr + 2;
            incr++;
        }
        System.out.println(Arrays.toString(list));

    }
}
