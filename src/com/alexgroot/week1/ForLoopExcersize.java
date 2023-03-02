package com.alexgroot.week1;

public class ForLoopExcersize {

    public static void main(String[] args) {

        //for (int i = 1; i <=7 ; i++) { System.out.println(i+" "+(i+1) +" "+(i+2)); }

        for(int i=8; i>0; i--){
            System.out.println();
            for (int j = 1; j <= 8; j++) {
                System.out.print("("+i+", "+j+")");

            }
        }
    }
}
