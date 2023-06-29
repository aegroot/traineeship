package com.alexgroot.deel1.week1.narrative0;

public class Day6 {
    public static void main(String[] args) {
        Day6 day = new Day6();

        day.poor_DuckBear(7);
    }

    public void poor_DuckBear(int eggAmount) {


        int eggRest = eggAmount % 4;
        int eggDivision = (eggAmount - eggRest) / 4;

        System.out.printf("eacht sister gets %d eggs, the duckbear gets %d eggs", eggDivision, eggRest);


    }
}
