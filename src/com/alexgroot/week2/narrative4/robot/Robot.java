package com.alexgroot.week2.narrative4.robot;

import com.alexgroot.week2.narrative4.robot.command.EastCommand;
import com.alexgroot.week2.narrative4.robot.command.NorthCommand;
import com.alexgroot.week2.narrative4.robot.command.SouthCommand;
import com.alexgroot.week2.narrative4.robot.command.WestCommand;

public class Robot {
    private int x;
    private int y;
    private final boolean isPowered;
    private final RobotCommand[] commands = new RobotCommand[4];

    public Robot() {

        this.isPowered = true;
        commands[0] = new NorthCommand();
        commands[1] = new SouthCommand();
        commands[2] = new WestCommand();
        commands[3] = new EastCommand();

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
