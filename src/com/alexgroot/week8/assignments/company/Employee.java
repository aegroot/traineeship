package com.alexgroot.week8.assignments.company;

public abstract class Employee {
    private final String name;
    private String adress;
    private String phoneNumber;
    private int experience;


    public Employee(String name, String adress, String phoneNumber, int experience) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setExperience(int experience) {
        if (experience < 0) return;
        this.experience = experience;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "dit is een employee met de naam " + name;
    }
}
