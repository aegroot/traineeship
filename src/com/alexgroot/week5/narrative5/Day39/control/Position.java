package com.alexgroot.week5.narrative5.Day39.control;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    protected void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return x + " : " + y;
    }
}
