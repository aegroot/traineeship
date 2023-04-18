package com.alexgroot.week6.Day40.enemies;

import com.alexgroot.week5.narrative5.Day39.maze.BlockState;

public class MaelStrom extends Enemy implements EnemyActions {
    public MaelStrom(int xPos, int yPos) {
        super(xPos, yPos, BlockState.Maelstrom);
    }

    @Override
    public boolean growlCheck(int x, int y) {
        return (Math.abs(x - xPos) == 1) != (Math.abs(y - yPos) == 1);
    }

    @Override
    public String giveGrowl(int x, int y) {
        if (growlCheck(x, y)) return "\n you see another world";
        return "";
    }
}
