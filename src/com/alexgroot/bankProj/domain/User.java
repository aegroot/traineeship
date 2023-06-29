package com.alexgroot.bankProj.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class User {
    private static final ArrayList<User> users = new ArrayList<>();
    private final BankAccount bankAccount;

    private final String name;
    private final String adress;
    private final Date dateOfBirth;

    public User(BankAccount bankAccount, String name, String adress, Date dateOfBirth) {
        this.bankAccount = bankAccount;
        this.name = name;
        this.adress = adress;
        this.dateOfBirth = dateOfBirth;
        users.add(this);
    }

    public static Optional<BankAccount> getUserByName(String name) {
        for (User user : users) {
            if (user.name.equals(name)) {
                return Optional.of(user.bankAccount);
            }
        }
        return Optional.empty();
    }

    public static Optional<BankAccount> getUserByNumber(String name) {
        for (User user : users) {
            if (user.getBankAccount().getBankNumber().equals(name)) {
                return Optional.of(user.bankAccount);
            }
        }
        return Optional.empty();
    }


    private static ArrayList<User> getUsers() {
        return users;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getName() {
        return name;
    }

    public static void transaction(BigDecimal amount, BankAccount to, BankAccount from) {
        if (to.canExecuteTransaction(amount) && from.canExecuteTransaction(amount)) {
            to.executeTransaction(from, amount);
            from.executeTransaction(to, amount);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "bankAccount=" + bankAccount +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
