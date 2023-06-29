package com.alexgroot.deel1.week1.narrative0;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        Day3 day = new Day3();
        day.thingNamer3000();

    }

    public void thingNamer3000() {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);

        //stores the next String input of the user
        String a = input.next();
        System.out.println("How would you describe it? Big? Azure? Tattered?");

        /*stores the next String input of the user*/
        String b = input.next();

        //stores a constant String value in parameter c
        String c = "of Doom";
        //stores a constant String value in parameter d
        String d = "3000";
        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
    }

}
