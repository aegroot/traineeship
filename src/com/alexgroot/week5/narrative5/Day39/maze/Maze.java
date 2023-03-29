package com.alexgroot.week5.narrative5.Day39.maze;

public class Maze {
    private final int xSize;
    private final int ySize;

    private final Block[][] maze;

    public Maze(int xSize, int ySize, int goalX, int goalY) {
        if (goalX >= xSize || goalY >= ySize) {
            throw new IllegalArgumentException("goal out of bounds");
        }
        this.xSize = xSize;
        this.ySize = ySize;

        maze = new Block[xSize][ySize];

        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < xSize; j++) {
                maze[i][j] = new Block(i, j);
            }
        }
        maze[goalX][goalY].changeState(BlockState.goal);
        maze[0][0].changeState(BlockState.exit);
    }

    public Maze(int xSize, int ySize, int goalX, int goalY, int pitAmount) {
        this(xSize, ySize, goalX, goalY);
        for (int i = 0; i < pitAmount; i++) {
            int randX = (int) (Math.round(Math.random()) * xSize);
            int randy = (int) (Math.round(Math.random()) * ySize);
            maze[randX][randy].changeState(BlockState.pit);
        }
    }

    public boolean inBounds(int x, int y) {
        return !(x < 0 || x >= xSize || y < 0 || y >= ySize);
    }

    public BlockState stateAt(int x, int y) {
        return maze[x][y].getState();
    }


}
