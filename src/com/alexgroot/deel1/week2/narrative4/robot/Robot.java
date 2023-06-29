package com.alexgroot.deel1.week2.narrative4.robot;

import com.alexgroot.deel1.week2.narrative4.robot.command.EastCommand;
import com.alexgroot.deel1.week2.narrative4.robot.command.NorthCommand;
import com.alexgroot.deel1.week2.narrative4.robot.command.SouthCommand;
import com.alexgroot.deel1.week2.narrative4.robot.command.WestCommand;

import java.util.ArrayList;

public class Robot {
    private int x;
    private int y;
    private final boolean isPowered;
    private final ArrayList<RobotCommand> commands;

    public Robot() {

        this.isPowered = true;
        commands = new ArrayList<>();
        commands.add(new NorthCommand());
        commands.add(new SouthCommand());
        commands.add(new WestCommand());
        commands.add(new EastCommand());
    }

    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }

    public void move(int x, int y) {
        if (!isPowered) {
            return;
        }
        this.x += x;
        this.y += y;
    }
}
