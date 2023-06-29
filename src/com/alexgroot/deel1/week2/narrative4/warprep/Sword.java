package com.alexgroot.deel1.week2.narrative4.warprep;

public class Sword {
    private final Material material;
    private final Gemstone gemstone;
    private final float length;
    private final float crossGuard;

    public Sword(Material material, Gemstone gemstone, float length, float crossGuard) {
        this.material = material;
        this.gemstone = gemstone;
        this.length = length;
        this.crossGuard = crossGuard;
    }

    public Sword(Material material, float length, float crossGuard) {
        this.material = material;
        this.gemstone = Gemstone.none;
        this.length = length;
        this.crossGuard = crossGuard;
    }
}
