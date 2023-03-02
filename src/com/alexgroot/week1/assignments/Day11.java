package com.alexgroot.week1.assignments;

import java.util.ArrayList;
import java.util.Scanner;


public class Day11 {
    public static void main(String[] args) {
        Day11 day=new Day11();
        day.inventory();
    }

    public void inventory(){
        new InventoryItem("Rope",10);
        new InventoryItem("Torches",15);
        new InventoryItem("Climbing Equipment",25);
        new InventoryItem("Clean Water",1);
        new InventoryItem("Machete",20);
        new InventoryItem("Canoe",200);
        new InventoryItem("Food Supplies",1);

        ArrayList<InventoryItem>items=InventoryItem.getItems();
        System.out.println("pick you item");
        Scanner sc=new Scanner(System.in);
        int pick=sc.nextInt();


        int size=items.size();

        if(pick<=0||pick>=size){System.out.println("not in stock");}
        else {
            InventoryItem item=items.get(pick);
            System.out.printf("%s costs %f",item.getName(),item.getPrice());}

    }
}


 class InventoryItem{
    private static final ArrayList<InventoryItem>items=new ArrayList<>();

    private final String name;
   private final float price;

     public InventoryItem(String name,float price) {
         this.name = name;
         this.price=price;
         items.add(this);
     }

     public static ArrayList<InventoryItem> getItems() {
         return items;
     }

     public float getPrice() {
         return price;
     }

     public String getName() {
         return name;
     }
 }
