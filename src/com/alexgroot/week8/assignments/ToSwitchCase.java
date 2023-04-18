package com.alexgroot.week8.assignments;

public class ToSwitchCase {
    public static void main(String[] args) {
        printBrowser("chrome");

    }

    public static void printBrowser(String answer) {
        switch (answer) {
            case "Edge":
                System.out.println("je gebruikt Edge");
                break;
            case "chrome":
            case "firefox":
            case "opera":
                System.out.println("je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("waarom gebruik je internet explorer?");
                break;
            default:
                System.out.println("je gebruikt een niet-ondersteunde browser");

        }
    }
}
