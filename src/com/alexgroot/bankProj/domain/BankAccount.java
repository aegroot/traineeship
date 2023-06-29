package com.alexgroot.bankProj.domain;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BankAccount {
    private final String bankNumber;
    private final ArrayList<Transaction> transactions;

    public BankAccount(String bankNumber) {
        this.bankNumber = bankNumber;
        transactions = new ArrayList<>();
    }

    public Boolean canExecuteTransaction(BigDecimal amount) {
        return calculateBalance().add(amount).intValue() > -1000;
    }


    public void executeTransaction(BankAccount account, BigDecimal amount) {
        transactions.add(new Transaction(this, account, amount));
    }


    public BigDecimal calculateBalance() {
        BigDecimal total = BigDecimal.valueOf(0);

        for (Transaction transaction : transactions) {
            total = total.add(transaction.getAmount());
        }

        return total;
    }

    public void stort(BigDecimal amount) {
        executeTransaction(this, amount);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getBankNumber() {
        return bankNumber;
    }
}
