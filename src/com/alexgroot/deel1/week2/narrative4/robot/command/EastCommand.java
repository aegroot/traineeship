package com.alexgroot.deel1.week2.narrative4.robot.command;

import com.alexgroot.deel1.week2.narrative4.robot.Robot;
import com.alexgroot.deel1.week2.narrative4.robot.RobotCommand;

public class EastCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.move(-1, 0);
    }
}
