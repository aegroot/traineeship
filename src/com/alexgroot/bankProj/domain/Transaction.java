package com.alexgroot.bankProj.domain;

import java.math.BigDecimal;

public class Transaction {
    private final BankAccount userTo;
    private final BankAccount userFrom;
    private final BigDecimal amount;

    public Transaction(BankAccount userTo, BankAccount userFrom, BigDecimal amount) {
        this.userTo = userTo;
        this.userFrom = userFrom;
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transactie{" +
                "userTo=" + userTo +
                ", userFrom=" + userFrom +
                ", amount=" + amount +
                '}';
    }
}
