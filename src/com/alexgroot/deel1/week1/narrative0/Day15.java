package com.alexgroot.deel1.week1.narrative0;

public class Day15 {
    public static void main(String[] args) {
        int[] array = {4, 51, -7, 13, -99, 15, -8, 45, 90};
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
        for (int item : array) {
            if (item < currentSmallest)
                currentSmallest = item;
        }
        System.out.println(currentSmallest);
        int total = 0;
        for (int index = 0; index < array.length; index++)
            total += array[index];
        double average = (double) total / array.length;
        System.out.println(average);
    }
}
