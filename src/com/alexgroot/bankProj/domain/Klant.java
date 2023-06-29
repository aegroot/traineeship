package com.alexgroot.bankProj.domain;

import java.util.ArrayList;
import java.util.Date;

public class Klant extends Gebruiker {
    private final ArrayList<Rekening> rekenings;

    public Klant(String naam, String adres, Date geboorteDatum) {
        super(naam, adres, geboorteDatum);
        this.rekenings = new ArrayList<>();
    }


}
