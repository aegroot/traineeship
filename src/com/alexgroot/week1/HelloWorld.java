package com.alexgroot.week1;

public class HelloWorld {

    public static void main(String[] args) {
        double randres=Math.random()*2-1;

        //System.out.println(randres);
         boolean no= randres > 0;

        String res="";



        if(no){res="hello world!";}
        else {res="goodbye for now";}

        System.out.println(res);
	// write your code here
    }
}
