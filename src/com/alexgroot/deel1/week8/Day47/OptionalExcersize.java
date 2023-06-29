package com.alexgroot.deel1.week8.Day47;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class OptionalExcersize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Optional<Integer> optInt = askForInt(sc);
        while (optInt.isEmpty()) {
            System.out.println("invalid input");
            optInt = askForInt(sc);
        }
    }

    public static Optional<Integer> askForInt(Scanner sc) {
        try {
            return Optional.of(sc.nextInt());
        } catch (InputMismatchException i) {
            sc.nextLine();
            return Optional.empty();
        }
    }
}
