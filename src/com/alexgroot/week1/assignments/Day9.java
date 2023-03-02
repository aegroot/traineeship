package com.alexgroot.week1.assignments;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {

    }
    public void clockTower_repair(){
        Scanner sc=new Scanner(System.in);

        int intput=sc.nextInt();

        int conc=intput%2;

        if (conc==1){System.out.println("tick");}
        else System.out.println("tock");


    }
}
