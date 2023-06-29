package com.alexgroot.deel1.week2.narrative4.inventory;

import java.util.ArrayList;
import java.util.List;

public class Pack {

    private final float weightLimit;
    private final float volumeLimit;

    private final int itemLimit;
    private final List<InventoryItem> items;

    public Pack(float weightLimit, float volumeLimit, int itemLimit) {
        this.weightLimit = weightLimit;
        this.volumeLimit = volumeLimit;
        this.itemLimit = itemLimit;

        items = new ArrayList<>();
    }

    public void add(InventoryItem item) {
        if (getTotalVolume() + item.getVolume() > volumeLimit) {
        } else if (getTotalWeight() + item.getWeight() > weightLimit) {
        } else if (items.size() >= itemLimit) {
        } else items.add(item);
    }

    private float getTotalWeight() {
        float counter = 0f;

        for (InventoryItem item : items) {
            counter += item.getWeight();
        }
        return counter;
    }

    private float getTotalVolume() {
        float counter = 0f;

        for (InventoryItem item : items) {
            counter += item.getVolume();
        }
        return counter;
    }

    public float getVolumeLimit() {
        return volumeLimit;
    }

    public float getWeightLimit() {
        return weightLimit;
    }

    public int getItemLimit() {
        return itemLimit;
    }

    @Override
    public String toString() {
        return "Pack containing " + items;
    }
}
