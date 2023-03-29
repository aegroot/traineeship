package com.alexgroot.week5.narrative5.Day39.maze;

public class Block {
    private final int x;
    private final int y;
    private BlockState state;

    public Block(int x, int y) {
        this.x = x;
        this.y = y;

        this.state = BlockState.empty;
    }

    protected void changeState(BlockState state) {
        this.state = state;
    }

    public BlockState getState() {
        return state;
    }
}
