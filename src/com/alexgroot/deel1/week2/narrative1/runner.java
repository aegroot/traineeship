package com.alexgroot.deel1.week2.narrative1;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        getArrow();
    }

    public static void getArrow() {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the arrow shop");
        System.out.print("custom arrow 1 premade arrow 2 else cancel");
        int choice = sc.nextInt();
        if (choice == 1) {

            System.out.println();
            System.out.print("for your arrowheads: 1 steel 2 wooden 3 obsidian");

            int arrowheadChoice = sc.nextInt();
            if (arrowheadChoice < 0 || arrowheadChoice > 3) {
                return;
            }
            arrowHeadType arrowHead = arrowHeadType.values()[arrowheadChoice - 1];

            System.out.print("for your feathers: 1 plastic 2 turkey 3 goose");
            int featherchoice = sc.nextInt();
            if (featherchoice < 0 || featherchoice > 3) {
                return;
            }
            fletchingType arrowFeather = fletchingType.values()[featherchoice - 1];
            System.out.println();
            System.out.print("length between 60 and 100 please");
            int length = sc.nextInt();

            Arrow arrow = new Arrow(length, arrowHead, arrowFeather);
            System.out.println("that is " + arrow.getPrice());
        } else if (choice == 2) {
            System.out.print("1 for elite 2 for marksman 3 for beginner");
            int arrowchoice = sc.nextInt();

            Arrow arrow = null;

            switch (arrowchoice) {
                case 1:
                    arrow = Arrow.createEliteArrow();
                    break;
                case 2:
                    arrow = Arrow.createMarksmanArrow();
                    break;
                case 3:
                    arrow = Arrow.createBeginnerArrow();
                    break;

            }

            assert arrow != null;
            System.out.println("that is " + arrow.getPrice());
        }
    }

}
