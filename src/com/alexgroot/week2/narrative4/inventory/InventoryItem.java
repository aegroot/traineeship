package com.alexgroot.week2.narrative4.inventory;

public abstract class InventoryItem {
    private final float weight;
    private final float volume;


    public InventoryItem(float weight, float volume) {
        this.weight = weight;
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public float getWeight() {
        return weight;
    }
}
