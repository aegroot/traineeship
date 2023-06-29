package com.alexgroot.deel2.week1;

import com.alexgroot.deel1.week8.Day47.OptionalExcersize;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        int random = (int) (Math.round(Math.random() * 10)) - 1;
        System.out.println(random);
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {

            Optional<Integer> inputValue = OptionalExcersize.askForInt(sc);
            if (inputValue.isPresent()) {

                int input = inputValue.get();
                if (numbers.contains(input)) {
                    System.out.println("already quessed");
                    continue;
                }
                if (input == random) {
                    break;
                } else {
                    numbers.add(input);
                }

            } else System.out.println("wrong input");
        }
    }
}
