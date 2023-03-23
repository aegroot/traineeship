package com.alexgroot.week2.narrative4.inventory.items;

import com.alexgroot.week2.narrative4.inventory.InventoryItem;

public class Sword extends InventoryItem {
    public Sword() {
        super(5, 3);
    }

    @Override
    public String toString() {
        return " Sword ";
    }
}
