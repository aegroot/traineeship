package com.alexgroot.deel1.week1;

public class LightSwitch {

    boolean lampState=false;

    public void turnOn(){
        if (lampState){return;} else lampState=true;
    }
    public  void turnOff(){

        if(!lampState) {return;}
        else lampState=false;
    }

    public static void main(String[] args) {
        LightSwitch lightSwitch=new LightSwitch();

        System.out.println(lightSwitch.lampState);
        lightSwitch.turnOn();
        System.out.println(lightSwitch.lampState);
        lightSwitch.turnOff();
        System.out.println(lightSwitch.lampState);
    }
}
