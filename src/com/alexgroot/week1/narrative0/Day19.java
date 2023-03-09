package com.alexgroot.week1.narrative0;

import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        ChestSTATE state = ChestSTATE.LOCKED;

        System.out.print("The chest is locked. What do you want to do?");
        System.out.println();

        while (true) {

            System.out.printf("The chest is %s. What do you want to do?", state);
            String input = sc.nextLine();

            if (input.equals("open")) {
                state = state == ChestSTATE.CLOSED ? ChestSTATE.OPEN : state;
            } else if (input.equals("close")) {
                state = ChestSTATE.CLOSED;
            } else if (input.equals("lock")) {
                state = state == ChestSTATE.OPEN ? state : ChestSTATE.LOCKED;
            } else if (input.equals("unlock")) {
                state = state == ChestSTATE.LOCKED ? ChestSTATE.CLOSED : state;
            } else break;

            System.out.println();


        }


    }

}

enum ChestSTATE {
    OPEN, CLOSED, LOCKED
}
