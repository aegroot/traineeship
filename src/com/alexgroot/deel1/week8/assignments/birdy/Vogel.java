package com.alexgroot.deel1.week8.assignments.birdy;

public class Vogel {
    private final String naam;
    private final int leeftijd;

    public Vogel(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public Vogel(String naam) {
        this.naam = naam;
        this.leeftijd = 0;
    }

    @Override
    public String toString() {
        return "mijn naam is" + naam;
    }

    public void hello() {
        System.out.println("cheep cheep");
    }
}
