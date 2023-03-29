package com.alexgroot.week4.lucasNumber;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("geef een natuurlijk getal");
        System.out.println();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        LucasFunc func = new LucasFunc();
        ArrayList<Integer> lucasList = func.generateLucasList(200);


        for (Integer number : lucasList) {
            System.out.print(" " + number + " ");
        }

    }
}
