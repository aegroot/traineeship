package com.alexgroot.deel1.week2.narrative2;

public class Color {
    private final int x;
    private final int y;
    private final int z;

    public Color(int x, int y, int z) {
        this.x = x > 255 || x < 0 ? 0 : x;
        this.y = y > 255 || x < 0 ? 0 : y;
        this.z = z > 255 || x < 0 ? 0 : z;
    }

    public static Color getWhite() {
        return new Color(255, 255, 255);
    }

    public static Color getBlack() {
        return new Color(0, 0, 0);
    }

    public static Color getOrange() {
        return new Color(255, 165, 0);
    }

    public static Color getYellow() {
        return new Color(255, 255, 0);
    }

    public static Color getGreen() {
        return new Color(0, 128, 0);
    }

    public static Color getBlue() {
        return new Color(0, 0, 255);
    }

    public static Color getRed() {
        return new Color(255, 0, 0);
    }

    public static Color getPurple() {
        return new Color(128, 0, 128);
    }


}
