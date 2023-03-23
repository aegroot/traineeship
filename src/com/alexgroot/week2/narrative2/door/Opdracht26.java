package com.alexgroot.week2.narrative2.door;

import java.util.Scanner;

public class Opdracht26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("type in a passcode of your choosing please");
        int passcode = sc.nextInt();
        Door door = new Door(passcode);
        System.out.println();

        while (true) {
            System.out.println("your door is " + door.getDoorState());
            System.out.println("please pick an option");
            System.out.println(" 0 open, 1 close ,2 lock, 3 unlock");


            int choice = -1;
            choice = sc.nextInt();

            if (choice < 0 || choice >= 4) {
                break;
            } else {
                switch (choice) {
                    case 0:
                        door.open();
                        break;
                    case 1:
                        door.close();
                        break;
                    case 2:
                        door.lock();
                        break;
                    case 3:
                        unlockHandler(sc, door);
                }
            }

        }

    }

    public static void unlockHandler(Scanner sc, Door door) {
        System.out.println("please enter you code to unlock");
        int code = sc.nextInt();
        door.unlock(code);
    }
}
