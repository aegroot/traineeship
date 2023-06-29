package com.alexgroot.deel1.week1;

public class ForLoopExcersize {

    public static void main(String[] args) {
        int UPPER_BOUNDS = 8;


        //for (int i = 1; i <=7 ; i++) { System.out.println(i+" "+(i+1) +" "+(i+2)); }

        for (int i = UPPER_BOUNDS; i > 0; i--) {
            System.out.println();
            for (int j = 1; j <= UPPER_BOUNDS; j++) {
                System.out.print("(" + i + ", " + j + ")");

            }
        }
    }
}
