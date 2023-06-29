package com.alexgroot.deel1.week1.narrative0;

import java.awt.*;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Day8 day = new Day8();
        day.defense_Consolas();

    }

    public void defense_Consolas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Target Row?");
        int x = sc.nextInt();

        System.out.print("Target column?");
        int y = sc.nextInt();

        System.out.println("Deploy to:");
        System.out.printf("(%d, %d)", x, y - 1);
        System.out.println();
        System.out.printf("(%d, %d)", x - 1, y);
        System.out.println();
        System.out.printf("(%d, %d)", x, y + 1);
        System.out.println();
        System.out.printf("(%d, %d)", x + 1, y);

        Toolkit.getDefaultToolkit().beep();

    }


}
