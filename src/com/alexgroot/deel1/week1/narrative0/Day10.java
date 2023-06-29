package com.alexgroot.deel1.week1.narrative0;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Day10 day = new Day10();

        day.watchTower();

    }

    public void watchTower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("x-coordinate");
        int x = sc.nextInt();
        System.out.println("y-coordinate");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("The enemy is here!");
        } else {
            String vDir = "";
            String hDir = "";
            if (y > 0) {
                vDir = "north";
            } else if (y < 0) {
                vDir = "south";
            } else vDir = "";

            if (x > 0) {
                hDir = "east";
            } else if (x < 0) {
                hDir = "west";
            } else hDir = "";


            System.out.printf("The enemy is to the %s%s!", vDir, hDir);
        }
    }
}

