package com.alexgroot.week5.narrative5.Day39.maze;

import com.alexgroot.week6.Day40.gameSettings.GameSettings;

public class Maze {


    private final int width;
    private final int height;

    private final Block[][] maze;

    public Maze(int width, int height, int goalX, int goalY) {
        if (goalX >= width || goalY >= height) {
            throw new IllegalArgumentException("goal out of bounds");
        }

        this.width = width;
        this.height = height;
        maze = new Block[width][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                maze[i][j] = new Block(i, j);
            }
        }
        maze[goalX][goalY].changeState(BlockState.goal);
        maze[0][0].changeState(BlockState.exit);
    }


    public Maze(int width, int height, int goalX, int goalY, int pitAmount) {

        this(width, height, goalX, goalY);
        for (int i = 0; i < pitAmount; i++) {
            int randX = (int) (Math.round(Math.random()) * (width - 1));
            int randy = (int) (Math.round(Math.random()) * (height - 1));
            maze[randX][randy].changeState(BlockState.pit);
        }
    }

    public Maze(int width, int height, int goalX, int goalY, GameSettings settings) {
        this(width, height, goalX, goalY);
        settings.getEnemies().forEach(setting -> {
            maze[setting.getxPos()][setting.getyPos()]
                    .changeState(setting.getState());
        });
    }

    public boolean inBounds(int x, int y) {
        return !(x < 0 || x >= width || y < 0 || y >= height);
    }

    public BlockState stateAt(int x, int y) {
        return maze[x][y].getState();
    }

    public void emptyAt(int xCord, int yCord) {
        if (inBounds(xCord, yCord) && maze[xCord][yCord].getState() != BlockState.exit)
            maze[xCord][yCord].changeState(BlockState.empty);
    }


}
