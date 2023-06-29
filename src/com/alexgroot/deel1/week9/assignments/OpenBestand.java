package com.alexgroot.deel1.week9.assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class OpenBestand {
    public static void main(String[] args) {
        try (FileInputStream fStr = new FileInputStream("test.txt")) {
            System.out.println(Arrays.toString(fStr.readAllBytes()));
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            System.out.println("hello");
        }

    }
}
