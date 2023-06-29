package com.alexgroot.bankProj.domain;

import java.util.ArrayList;
import java.util.Date;

public class Gebruiker {
    private static final ArrayList<Gebruiker> gebruikers = new ArrayList<>();
   
    private final String naam;
    private final String adres;
    private final Date geboorteDatum;

    public Gebruiker(String naam, String adres, Date geboorteDatum) {
        this.naam = naam;
        this.adres = adres;
        this.geboorteDatum = geboorteDatum;
        gebruikers.add(this);
    }

    public ArrayList<Gebruiker> getGebruikers() {
        if (this instanceof Medewerker) {
            return gebruikers;
        } else return new ArrayList<>();

    }

    public String getNaam() {
        return naam;
    }
}
