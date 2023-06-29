package com.alexgroot.deel1.week4.lucasNumber;

import java.util.ArrayList;

public class LucasFunc {
    public final Integer limit = (int) Math.pow(128, 4);

    public void addNextLucasNumber(ArrayList<Integer> numbers) {
        if (numbers.size() >= 2) {
            int index1 = numbers.get(numbers.size() - 1);
            int index2 = numbers.get(numbers.size() - 2);
            int nextNumber = index1 + index2;
            numbers.add(nextNumber);
        }
    }

    public ArrayList<Integer> generateLucasList(int amount) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        if (amount <= 2) {
            return integers;
        }

        for (int i = 2; i <= amount; i++) {
            if (integers.get(integers.size() - 1) >= limit) {
                break;
            } else addNextLucasNumber(integers);
        }

        return integers;
    }
}
