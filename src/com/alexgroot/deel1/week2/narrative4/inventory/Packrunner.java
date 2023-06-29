package com.alexgroot.deel1.week2.narrative4.inventory;

import com.alexgroot.deel1.week2.narrative4.inventory.items.Sword;

public class Packrunner {
    public static void main(String[] args) {
        Pack pack = new Pack(10, 20, 6);
        pack.add(new Sword());
    }
}
