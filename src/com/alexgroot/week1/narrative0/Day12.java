package com.alexgroot.week1.narrative0;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        int numberAns = -1;
        Scanner sc = new Scanner(System.in);

        while (numberAns < 0 || numberAns > 101) {

            System.out.print("User 1, enter a number between 0 and 100: ");

            numberAns = sc.nextInt();
            System.out.println();
        }


        System.out.println("After entering this number, the program should clear the screen and continue like this:");


        System.out.println("User 2, guess the number.");
        int quess = 0;
        while (quess != numberAns) {
            System.out.print("What is your next guess? ");
            quess = sc.nextInt();

            if (quess != numberAns) {
                if (quess > numberAns) {
                    System.out.println(quess + " is too high.");
                } else if (quess < numberAns) {
                    System.out.println(quess + " is too low.");
                }
            } else {
                System.out.println("you quessed the number!");
                break;
            }
        }

    }

}

