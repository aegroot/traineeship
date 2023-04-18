package com.alexgroot.week5.narrative5.Day39;

import com.alexgroot.week5.narrative5.Day39.control.MazeController;
import com.alexgroot.week5.narrative5.Day39.control.Position;
import com.alexgroot.week5.narrative5.Day39.maze.BlockState;
import com.alexgroot.week5.narrative5.Day39.maze.Maze;

import java.util.Scanner;

public class MazeRunner {

    public static void main(String[] args) {
        Maze maze = new Maze(4, 4, 2, 1, 3);
        MazeController controller = new MazeController(maze);

        Scanner sc = new Scanner(System.in);

        int playerX = 0;
        int playerY = 0;

        while (!controller.isComplete()) {

            System.out.printf("current player position: %d : %d"
                    , playerX, playerY);
            System.out.println();
            System.out.println("please pick a move \n 1: left \n 2: right \n 3: up\n 4: down \n");

            int input = sc.nextInt();
            if (input > 4 || input < 0) {
                System.out.println("invalid input");
                continue;
            }

            switch (input) {
                case 1:
                    controller.movePlayer(0, 1);
                    break;
                case 2:
                    controller.movePlayer(0, -1);
                    break;
                case 3:
                    controller.movePlayer(1, 0);
                    break;
                case 4:
                    controller.movePlayer(-1, 0);
                    break;
            }
            Position playerPosition = controller.getPlayerPosition();
            playerX = playerPosition.getX();
            playerY = playerPosition.getY();

            if (maze.stateAt(playerX, playerY) == BlockState.goal) {
                System.out.println("you activated the fountain, good job!");
                controller.setEnabledFountain();
            } else if (maze.stateAt(playerX, playerY) == BlockState.pit) {
                System.out.println("you died");
                return;

            }
        }
        System.out.println("you win the game!");

    }

}
