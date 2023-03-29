package com.alexgroot.week5.narrative5.Day39.control;

import com.alexgroot.week5.narrative5.Day39.maze.Maze;

public class MazeController {
    boolean enabledFountain;
    private final Position playerPosition;

    private final Maze maze;

    public MazeController(Maze maze) {
        this.maze = maze;
        this.enabledFountain = false;
        this.playerPosition = new Position(0, 0);
    }

    public void movePlayer(int x, int y) {
        int pX = playerPosition.getX();
        int pY = playerPosition.getY();

        if (!maze.inBounds(x + pX, y + pY)) {
            throw new IllegalArgumentException("out of bounds");
        }
        playerPosition.move(x, y);

        System.out.println(playerPosition);
    }

    public boolean isComplete() {
        return playerPosition.getX() == 0 &&
                playerPosition.getY() == 0
                && enabledFountain;
    }

    public Position getPlayerPosition() {
        return playerPosition;
    }

    public void setEnabledFountain() {
        enabledFountain = true;
    }
}
