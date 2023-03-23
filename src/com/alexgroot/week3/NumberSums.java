package com.alexgroot.week3;

import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        NumberSums sums = new NumberSums();
        Scanner sc = new Scanner(System.in);

        System.out.print("geef een geheel positief getal");
        int input = sc.nextInt();
        int even = sums.sumEven(input);
        System.out.printf("som van even getallen tot en met %d is %d", input, even);
        System.out.println();
        int uneven = sums.sumUneven(input);
        System.out.printf("som van oneven getallen tot en met %d is %d", input, uneven);
        System.out.println();
        System.out.printf("verschil tussen twee sommen is %d", uneven - even);
    }

    public int sumEven(int input) {
        int res = 0;
        for (int i = 1; i < input; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        return res;
    }

    public int sumUneven(int input) {
        int res = 0;
        for (int i = 1; i < input; i++) {
            if (i % 2 == 1) {
                res += i;
            }
        }
        return res;
    }
}
