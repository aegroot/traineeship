package com.alexgroot.deel1.week2.narrative4.inventory.items;

import com.alexgroot.deel1.week2.narrative4.inventory.InventoryItem;

public class FoodRations extends InventoryItem {

    public FoodRations() {
        super(1, 0.5f);
    }

    @Override
    public String toString() {
        return " Food rations ";
    }
}
