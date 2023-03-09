package com.alexgroot.week1.narrative0;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        askForNumberInRange("e", 1, 100);

    }

    public static int askForNumber(String text) {
        System.out.println(text);
        Scanner sc = new Scanner(System.in);

        int res = sc.nextInt();
        //sc.close();
        return res;
    }

    public static int askForNumberInRange(String text, int lower, int upper) {

        int answer = askForNumber(text);
        while (answer < lower || answer > upper) {
            answer = askForNumber(text);
        }

        return answer;
    }
}
