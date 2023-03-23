package com.alexgroot.week2.narrative4.roomba;

public class roommate {
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(4, 3);
        Coordinate c2 = new Coordinate(5, 11);
        Coordinate c3 = new Coordinate(9, 9);
        System.out.println(c1.isAdjacent(c2));
        System.out.println(c1.isAdjacent(c3));
    }
}
