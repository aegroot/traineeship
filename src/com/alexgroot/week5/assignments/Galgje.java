package com.alexgroot.week5.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Galgje {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESSES = 20;
        Scanner sc = new Scanner(System.in);

        String inAnswer = sc.nextLine();
        ArrayList<Character> answer = new ArrayList<>();
        ArrayList<Character> quesses = new ArrayList<>();


        for (Character c : inAnswer.toCharArray()) {
            answer.add(c);
            quesses.add(' ');
        }
        if (answer.contains(' ')) {
            throw new IllegalArgumentException("forbidden character");
        }

        for (int i = 0; i < NUMBER_OF_QUESSES; i++) {
            System.out.print("current answer is");
            for (Character c : quesses) {
                System.out.print("," + c + " ");
            }

            System.out.println();

            Character quess = sc.nextLine().charAt(0);

            if (answer.contains(quess) && !quesses.contains(quess)) {
                for (int j = 0; j < answer.size(); j++) {
                    if (answer.get(j) == quess) {
                        quesses.set(j, quess);
                    }
                }
            }
            if (!quesses.contains(' ')) {
                System.out.println("you win!");
                break;
            }
        }
    }


}

