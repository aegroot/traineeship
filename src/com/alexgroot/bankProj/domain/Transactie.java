package com.alexgroot.bankProj.domain;

public class Transactie {
    private final Rekening userTo;
    private final Rekening userFrom;
    private final double amount;

    public Transactie(Rekening userTo, Rekening userFrom, double amount) {
        this.userTo = userTo;
        this.userFrom = userFrom;
        this.amount = amount;
    }
}
