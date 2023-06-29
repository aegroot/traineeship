package com.alexgroot.deel1.week8.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaEindOpdrachy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println("aantal karakters: " + input.length());
        System.out.println("aantal woorden: " + input.split(" ").length);
        int klinkerCount = 0;
        klinkerCount += countCharInString('a', input);
        klinkerCount += countCharInString('e', input);
        klinkerCount += countCharInString('o', input);
        klinkerCount += countCharInString('i', input);
        klinkerCount += countCharInString('u', input);
        klinkerCount += countCharInString('y', input);
        System.out.println("aantal klinkers: " + klinkerCount);
        System.out.println("Palindroom? " + isPalindroom(input));

        ArrayList<CharCounter> charCounters = new ArrayList<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            CharCounter counter = new CharCounter(ch, countCharInString(ch, input));
            charCounters.add(counter);
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            CharCounter counter = new CharCounter(ch, countCharInString(ch, input));
            charCounters.add(counter);

        }
        charCounters.add(new CharCounter(' ', countCharInString(' ', input)));

        int max = 0;

        for (CharCounter counter : charCounters) {
            if (counter.getCount() > max) {
                max = counter.getCount();
            }
        }
        for (int i = max; i > 0; i--) {
            for (CharCounter counter : charCounters) {
                String out = counter.getCount() >= i ? "* " : "  ";
                System.out.print(out);
            }
            System.out.println();
        }
        for (CharCounter counter : charCounters) {
            System.out.print(counter.getValue() + " ");
        }


    }

    public static int countCharInString(char c, String str) {

        int result = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c)
                result++;
        }
        return result;
    }

    public static boolean isPalindroom(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }


}

class CharCounter {

    private final char value;
    private final int count;

    public CharCounter(char value, int count) {
        this.count = count;
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }
}