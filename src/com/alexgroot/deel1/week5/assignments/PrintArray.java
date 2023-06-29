package com.alexgroot.deel1.week5.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" voer het aantal items in:");
        int NUM_ITEMS = sc.nextInt();
        sc.nextLine();

        System.out.println("voer de waarde van alle items in del is spatie");
        String[] inString = sc.nextLine().split(" ");
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = Integer.parseInt(inString[i]);
        }
        System.out.println("de waarden zijn " + Arrays.toString(items));
        System.out.println();
        System.out.println("Bonus");
        for (int i : items) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.printf("(%d)", i);
            System.out.println();
        }
    }
}
