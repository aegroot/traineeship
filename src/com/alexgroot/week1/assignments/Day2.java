package com.alexgroot.week1.assignments;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Day2 test=new Day2();
        //day2 1/3
        System.out.println("goodbye for now");

        //day2 2/3 ans= tot stack overflow
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        System.out.println("d");
        System.out.println("e");

        //day 2 3/3

        test.consolas_tellim();

    }

    public void consolas_tellim(){
        System.out.println("Bread is ready.");
        System.out.println("Who is the bread for?");

        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();

        System.out.printf("Noted: %s got bread",name);

    }

}
