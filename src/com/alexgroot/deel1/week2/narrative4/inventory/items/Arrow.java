package com.alexgroot.deel1.week2.narrative4.inventory.items;

import com.alexgroot.deel1.week2.narrative4.inventory.InventoryItem;

public class Arrow extends InventoryItem {
    public Arrow() {
        super(0.1f, 0.05f);
    }

    @Override
    public String toString() {
        return " Arrow ";
    }
}
