package com.alexgroot.week2.narrative2;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return String.format("(%d , %d)", x, y);
    }
}
