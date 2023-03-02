package com.alexgroot.week1;

public class WeekDagen {
    public static void main(String[] args) {
        int daynumber=4;

        String res="";

        //switch case???
        if(daynumber==0){res="zondag";}
        else if (daynumber==1){res="Maandag";}
        else if(daynumber==2){res="dinsdag";}
        else if(daynumber==3){  res="woensdag";}
        else if(daynumber==4){res="donderdag";}
        else if(daynumber==5){res="vrijdag";}
        else if(daynumber==6){res="zaterdag";}
        else {res="geen geldige dag: "+daynumber;}


        System.out.println(res);
    }
}
