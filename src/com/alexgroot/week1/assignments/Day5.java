package com.alexgroot.week1.assignments;

public class Day5 {
    public static void main(String[] args) {
        Day5 day=new Day5();
                day.triangleArea(5,7);
    }
    public void triangleArea(float base,float height){
        Float res=base * height/2;

        System.out.println(res);
    }
}
