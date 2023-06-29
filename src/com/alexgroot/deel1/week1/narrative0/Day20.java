package com.alexgroot.deel1.week1.narrative0;

public class Day20 {

    public static void main(String[] args) {
        Day20 day = new Day20(type.gumbo, main_ingedient.carrots, seasoning.salt);
        day.printContents();
    }

    public Day20(type t, main_ingedient mi, seasoning s) {
        this.t = t;
        this.mi = mi;
        this.s = s;
    }

    public type t;
    public main_ingedient mi;
    public seasoning s;

    public void printContents() {
        System.out.println(t + " " + mi + " " + s);
    }
}

enum type {soup, stew, gumbo}

enum main_ingedient {mushrooms, chicken, carrots, potatoes}

enum seasoning {spicy, salt, sweet}

