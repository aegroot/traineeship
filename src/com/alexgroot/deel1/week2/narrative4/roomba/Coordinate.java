package com.alexgroot.deel1.week2.narrative4.roomba;

public final class Coordinate {
    private final int column;
    private final int row;


    public Coordinate(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public boolean isAdjacent(Coordinate c) {
        return (Math.abs(row - c.getRow()) == 1) || (Math.abs(column - c.getColumn()) == 1);
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
