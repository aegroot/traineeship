package com.alexgroot.deel1.week2.narrative4.inventory.items;

import com.alexgroot.deel1.week2.narrative4.inventory.InventoryItem;

public class Water extends InventoryItem {
    public Water(float weight, float volume) {
        super(2, 3);

    }

    @Override
    public String toString() {
        return " Water ";
    }
}
