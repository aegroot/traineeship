package com.alexgroot.bankProj.domain;

import java.util.ArrayList;

public class Rekening {
    final String rekeningNummer;
    ArrayList<Transactie> transacties;
    double saldo;

    public Rekening(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
        transacties = new ArrayList<>();
        saldo = 0;
    }


    public boolean executeTransaction(Rekening gebruiker, double amount) {

        if (saldo + amount < -1000) {
            return false;
        }
        transacties.add(new Transactie(this, gebruiker, amount));
        saldo += amount;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }
}
