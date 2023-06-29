package com.alexgroot.deel1.week1;

public class WeekDagen {
    public static void main(String[] args) {
        int DAY_NUMBER = 4;

        String res = "";

        //switch case???
        if (DAY_NUMBER == 0) {
            res = "zondag";
        } else if (DAY_NUMBER == 1) {
            res = "Maandag";
        } else if (DAY_NUMBER == 2) {
            res = "dinsdag";
        } else if (DAY_NUMBER == 3) {
            res = "woensdag";
        } else if (DAY_NUMBER == 4) {
            res = "donderdag";
        } else if (DAY_NUMBER == 5) {
            res = "vrijdag";
        } else if (DAY_NUMBER == 6) {
            res = "zaterdag";
        } else {
            res = "geen geldige dag: " + DAY_NUMBER;
        }


        System.out.println(res);
    }
}
