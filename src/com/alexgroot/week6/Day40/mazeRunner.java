package com.alexgroot.week6.Day40;

import com.alexgroot.week5.narrative5.Day39.control.MazeController;
import com.alexgroot.week5.narrative5.Day39.control.Position;
import com.alexgroot.week5.narrative5.Day39.maze.Maze;
import com.alexgroot.week6.Day40.enemies.Amarok;
import com.alexgroot.week6.Day40.enemies.Enemy;
import com.alexgroot.week6.Day40.enemies.MaelStrom;
import com.alexgroot.week6.Day40.gameSettings.GameSettings;

import java.util.ArrayList;
import java.util.Scanner;

public class mazeRunner {


    public static void main(String[] args) {
        int bullets = 5;
        int height = 4;
        int width = 4;


        Scanner sc = new Scanner(System.in);
        System.out.println("choose size of you maze(small medium large)");
        String sizeInput = sc.nextLine().replace(" ", "");


        ArrayList<Enemy> enemies = new ArrayList<>();

        switch (sizeInput) {
            case "medium":
                height = width = 6;
                enemies.add(new MaelStrom(1, 2));
                enemies.add(new Amarok(2, 4));
                enemies.add(new Amarok(4, 4));
                break;
            case "large":
                enemies.add(new MaelStrom(7, 3));
                enemies.add(new MaelStrom(1, 2));
                enemies.add(new Amarok(4, 4));
                enemies.add(new Amarok(1, 4));
                enemies.add(new Amarok(4, 5));
                height = width = 8;
                break;
            case "small":
                enemies.add(new Amarok(2, 1));
                break;
            default:
                System.out.println("default maze will be generated without enemies");
                break;
        }

        int x = 2, y = 3;
        System.out.printf("generating maze of [%d,%d]", height, width);
        GameSettings settings = new GameSettings(enemies);

        Maze maze = new Maze(width, height, x, y, settings);
        MazeController controller = new MazeController(maze);

        int playerX = 0, playerY = 0;
        while (!controller.isComplete()) {
            System.out.println("\n ________________________________________________ \n");
            System.out.println(settings.giveResponses(playerX, playerY));
            System.out.printf("you are in the room at (Row=%d, Column=%d).", playerX, playerY);

            System.out.println("What do you want to do?");

            String direction = sc.nextLine();
            String[] command = direction.split(" ");
            if (command[0].equals("move")) {
                handleMovementCommand(controller, command[1]);
            } else if (command[0].equals("shoot")) {
                handleShootCommand(command[1], enemies,
                        controller);
            } else handleMovementCommand(controller, direction);

            Position playerPosition = controller.getPlayerPosition();
            playerX = playerPosition.getX();
            playerY = playerPosition.getY();

            try {
                System.out.println(controller.checkPosition(playerX, playerY));
            } catch (IllegalArgumentException ie) {
                System.out.println("you are endlessly drifting in the void \n game over!");
                return;
            }
        }
    }

    static void handleMovementCommand(MazeController controller, String command) {
        try {
            switch (command) {
                case "north":
                    controller.movePlayer(0, 1);
                    break;
                case "south":
                    controller.movePlayer(0, -1);
                    break;
                case "west":
                    controller.movePlayer(1, 0);
                    break;
                case "east":
                    controller.movePlayer(-1, 0);
                    break;
                default:
                    throw new IllegalArgumentException("");

            }
        } catch (IllegalArgumentException i) {
            System.out.println("illegal move");

        }

    }

    static void handleShootCommand(String command, ArrayList<Enemy> enemies, MazeController controller) {


        switch (command) {
            case "north":
                controller.shootAt(0, 1);
                break;
            case "south":
                controller.shootAt(0, -1);
                break;
            case "west":
                controller.shootAt(1, 0);
                break;
            case "east":
                controller.shootAt(-1, 0);
                break;
            default:
                System.out.println("illegal input: " + command);
        }
    }
}
