package com.alexgroot.deel1.week8.assignments.company;

public class Programmer extends Employee {
    private String programmingLanguages;

    public Programmer(String name, String adress, String phoneNumber, int experience, String programmingLanguages) {
        super(name, adress, phoneNumber, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeCode() {
        System.out.println("i am writing code");
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

}
