package com.alexgroot.week2.narrative4.robot.command;

import com.alexgroot.week2.narrative4.robot.Robot;
import com.alexgroot.week2.narrative4.robot.RobotCommand;

public class SouthCommand implements RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.move(0, -1);

    }
}
