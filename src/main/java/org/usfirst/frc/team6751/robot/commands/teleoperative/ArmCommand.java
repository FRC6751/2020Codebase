/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6751.robot.commands.teleoperative;

import org.usfirst.frc.team6751.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArmCommand extends Command {
    private boolean increaseSpeed = false;

    public ArmCommand(boolean increaseSpeed) {
        this.increaseSpeed = increaseSpeed;
        requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        if (increaseSpeed) {
            Robot.arm.increaseArmSpeed();
        } else {
            Robot.arm.decreaseArmSpeed();
        }
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.arm.stopArm();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
    }
}
