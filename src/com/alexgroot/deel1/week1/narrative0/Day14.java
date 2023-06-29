package com.alexgroot.deel1.week1.narrative0;


import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        int[] initArr = new int[5];
        Scanner sc = new Scanner(System.in);
        initArr[0] = sc.nextInt();
        initArr[1] = sc.nextInt();
        initArr[2] = sc.nextInt();
        initArr[3] = sc.nextInt();
        initArr[4] = sc.nextInt();

        int[] endArr = new int[5];

        System.arraycopy(initArr, 0, endArr, 0, 5);

        for (int i : initArr) {
            System.out.print(i + " ");
        }
        for (int i : endArr) {
            System.out.print(i + " ");
        }


    }


}
