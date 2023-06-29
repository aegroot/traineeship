package com.alexgroot.deel1.week8.assignments.company;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String adress, String phoneNumber, int experience, int teamSize) {
        super(name, adress, phoneNumber, experience);
        this.teamSize = teamSize;
    }

    public void reportProjectStatus() {
        System.out.println("all good");
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "dit is een manager met teamSize " + teamSize;
    }
}
