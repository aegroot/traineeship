package com.alexgroot.week8.assignments.birdy;

public class Specht extends Vogel {
    public Specht(String naam, int leeftijd) {
        super(naam, leeftijd);
    }

    @Override
    public void hello() {
        System.out.println("meep meep");
    }
}
