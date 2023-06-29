package com.alexgroot.deel1.week6.Day40.enemies;

import com.alexgroot.deel1.week5.narrative5.Day39.maze.BlockState;

public abstract class Enemy implements EnemyActions {
    final int xPos, yPos;
    final BlockState state;

    public Enemy(int xPos, int yPos, BlockState state) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.state = state;
    }

    public BlockState getState() {
        return state;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}
