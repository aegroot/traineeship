package com.alexgroot.deel1.week2.narrative4.inventory.items;

import com.alexgroot.deel1.week2.narrative4.inventory.InventoryItem;

public class Bow extends InventoryItem {
    public Bow() {
        super(1, 4);
    }

    @Override
    public String toString() {
        return " Bow ";
    }
}
