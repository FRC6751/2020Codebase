/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6751.robot.commands.teleoperative;

import org.usfirst.frc.team6751.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RollerCommand extends Command {
  private boolean increaseSpeed = false;

  public RollerCommand(boolean increaseSpeed) {
    this.increaseSpeed = increaseSpeed;
    requires(Robot.roller);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    if (increaseSpeed) {
      Robot.roller.increaseRollerSpeed();;
    } else {
      Robot.roller.decreaseRollerSpeed();;
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
    Robot.roller.stopRoller();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
