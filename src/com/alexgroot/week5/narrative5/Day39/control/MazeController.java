package com.alexgroot.week5.narrative5.Day39.control;

import com.alexgroot.week5.narrative5.Day39.maze.Maze;

public class MazeController {
    boolean enabledFountain;
    private final Position playerPosition;

    private final Maze maze;
    private boolean isDead;

    public MazeController(Maze maze) {
        isDead = false;
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
        return (playerPosition.getX() == 0 &&
                playerPosition.getY() == 0
                && enabledFountain) || isDead;
    }

    public String checkPosition(int x, int y) {
        StringBuilder sb = new StringBuilder();

        switch (maze.stateAt(x, y)) {
            case Amarok:
            case pit:

                sb.append("you died to ").append(maze.stateAt(x, y)).append("\n");
                sb.append("game over");
                isDead = true;
                break;
            case Maelstrom:
                sb.append("you stepped in a maestrom! woosh!\n");
                movePlayer(2, 1);
                checkPosition(x + 2, y + 1);
                break;
            case goal:
                sb.append("you activated the fountain, good job! \n");
                enabledFountain = true;
                break;
            case exit:
                if (isComplete()) {
                    sb.append("you win the game!");

                }
        }
        return sb.toString();
    }

    public Position getPlayerPosition() {
        return playerPosition;
    }

    public void setEnabledFountain() {
        enabledFountain = true;
    }
}
