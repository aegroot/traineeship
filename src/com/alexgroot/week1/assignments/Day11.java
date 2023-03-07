package com.alexgroot.week1.assignments;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Day11 {


    public static void main(String[] args) {
        Day11 day = new Day11();
        day.inventory();
    }
    
    public void inventory() {
        final String naam = "alex";

        //items are added to the in-class list items via constructor

        new InventoryItem("Rope", 10);
        new InventoryItem("Torches", 15);
        new InventoryItem("Climbing Equipment", 25);
        new InventoryItem("Clean Water", 1);
        new InventoryItem("Machete", 20);
        new InventoryItem("Canoe", 200);
        new InventoryItem("Food Supplies", 1);

        ArrayList<InventoryItem> items = InventoryItem.getItems();
        int size = items.size();


        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = sc.nextLine();
        System.out.println("pick your item");
        int pick = sc.nextInt();


        if (pick <= 0 || pick >= size) {
            System.out.println("not in stock");
        } else {
            InventoryItem item = items.get(pick - 1);


            float price = name.equals(naam) ? item.getPrice() / 2 : item.getPrice();
            System.out.printf("%s costs %f", item.getName(), price);
        }

    }
}


class InventoryItem {
    private static final ArrayList<InventoryItem> items = new ArrayList<>();
    private final String name;
    private final float price;

    public InventoryItem(String name, float price) {
        this.name = name;
        this.price = price;
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
