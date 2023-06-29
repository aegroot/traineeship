package com.alexgroot.bankProj.domain;

import java.util.ArrayList;
import java.util.Date;

public class Medewerker extends Gebruiker {
    public Medewerker(String naam, String adres, Date geboorteDatum) {
        super(naam, adres, geboorteDatum);
    }


    public Gebruiker getGebruikerByName(String naam) {
        ArrayList<Gebruiker> gebruikers = getGebruikers();
        for (Gebruiker gebr : gebruikers) {
            if (gebr.getNaam().equals(naam)) {
                return gebr;
            }
        }
        return null;
    }

}
