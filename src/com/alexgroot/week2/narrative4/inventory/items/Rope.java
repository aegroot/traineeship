package com.alexgroot.week2.narrative4.inventory.items;

import com.alexgroot.week2.narrative4.inventory.InventoryItem;

public class Rope extends InventoryItem {
    public Rope() {
        super(1, 1.5f);
    }

    @Override
    public String toString() {
        return " Rope ";
    }
}
