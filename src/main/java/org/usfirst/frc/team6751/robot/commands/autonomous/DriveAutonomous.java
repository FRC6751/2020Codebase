/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6751.robot.commands.Autonomous;

import org.usfirst.frc.team6751.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveAutonomous extends Command {
  private double speed = 0;
  private double rotation = 0;
  private int timeoutSeconds = 6;

  public DriveAutonomous(double speed, double rotation, int numSeconds) {
    this.speed = speed;
    this.rotation = rotation;
    this.timeoutSeconds = numSeconds;

    requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.drivetrain.driveArcade(this.speed, this.rotation);
    setTimeout(this.timeoutSeconds);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return this.isTimedOut();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drivetrain.stopDrive();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
