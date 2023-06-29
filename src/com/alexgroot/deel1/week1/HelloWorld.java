package com.alexgroot.deel1.week1;

public class HelloWorld {

    public static void main(String[] args) {
        double randomResult = Math.random() * 2 - 1;


        boolean no = randomResult > 0;

        String res = "";


        if (no) {
            res = "hello world!";
        } else {
            res = "goodbye for now";
        }

        System.out.println(res);
        // write your code here
    }
}
