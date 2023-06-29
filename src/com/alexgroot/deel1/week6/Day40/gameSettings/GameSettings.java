package com.alexgroot.deel1.week6.Day40.gameSettings;

import com.alexgroot.deel1.week6.Day40.enemies.Enemy;

import java.util.ArrayList;

public class GameSettings {
    private final ArrayList<Enemy> enemies;

    public GameSettings(ArrayList<Enemy> settings) {
        this.enemies = settings;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public String giveResponses(int x, int y) {
        StringBuilder sb = new StringBuilder(" ");

        for (Enemy enemy : enemies) {
            sb.append(enemy.giveGrowl(x, y));
        }
        return sb.toString();
    }

    public String killAt(int x, int y) {

        return "";
    }

}
