package com.alexgroot.week8.assignments;

public class Nested_for {

    public static void main(String[] args) {
        printTable(100);
    }

    public static void printTable(int maxNumber) {
        System.out.print("*  |  ");

        for (int i = 1; i <= maxNumber; i++) {

            System.out.print(i + "  ");

        }
        System.out.println();
        System.out.println("________________________________________________________________");
        for (int base = 1; base <= maxNumber; base++) {
            System.out.print(base);
            if (base < 10) {
                System.out.print("  |  ");
            } else if (base < 100) System.out.print(" |  ");
            else System.out.print("|  ");

            for (int res = 1; res <= maxNumber; res++) {
                int ans = res * base;
                System.out.print(ans);


                if (ans < 10) {
                    System.out.print("   ");
                } else if (ans < 100) System.out.print("  ");
                else System.out.print(" ");

            }
            System.out.println();
        }

    }
}

