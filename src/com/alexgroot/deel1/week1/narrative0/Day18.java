package com.alexgroot.deel1.week1.narrative0;

public class Day18 {
    public static void main(String[] args) {
        int goal = Day16.askForNumberInRange("the manticore has come. how far wil you drop it?", 0, 100);

        int turnNumber = 0;
        int consolasHealth = 15;
        int manticoreHealth = 10;

        while (manticoreHealth > 0 && consolasHealth > 0) {

            System.out.printf("STATUS: Round: %d City: %d/15 Manticore: %d/10", turnNumber, consolasHealth, manticoreHealth);
            int dmg = calculateDamage(turnNumber);

            System.out.println();

            System.out.printf("The cannon is expected to deal %d damage this round.", dmg);
            int input = Day16.askForNumberInRange("Enter desired cannon range: ", 0, 100);

            if (goal == input) {
                consolasHealth--;
                manticoreHealth -= dmg;
                System.out.println("That round was a DIRECT HIT!");
            } else if (input > goal) {
                System.out.println("That round OVERSHOT the target.");
            } else {
                System.out.println("That round FELL SHORT of the target");
            }

            turnNumber++;
        }
        if (manticoreHealth >= 0) {
            System.out.println("The Manticore has been destroyed! The city of Consolas has been saved!");
        } else System.out.println("consolas has fallen");

    }

    public static int calculateDamage(int number) {
        if (number % 3 == 0 && number % 5 == 0 && number != 0) {
            return 10;
        } else if (number % 3 == 0) {
            return 3;
        } else if (number % 5 == 0) {
            return 5;
        } else return 1;
    }
}
