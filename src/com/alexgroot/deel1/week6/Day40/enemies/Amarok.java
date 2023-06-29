package com.alexgroot.deel1.week6.Day40.enemies;

import com.alexgroot.deel1.week5.narrative5.Day39.maze.BlockState;

public class Amarok extends Enemy implements EnemyActions {

    public Amarok(int xPos, int yPos) {
        super(xPos, yPos, BlockState.Amarok);
    }

    @Override
    public boolean growlCheck(int x, int y) {
        return (Math.abs(x - xPos) <= 2 & (y == yPos)) != (Math.abs(y - yPos) <= 2 & (x == xPos));
    }

    @Override
    public String giveGrowl(int x, int y) {
        if (growlCheck(x, y)) return "you notice a rotten wolf looking hungry ";
        else return "";
    }


}
