/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6751.robot.subsystems;

import org.usfirst.frc.team6751.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Climber extends Subsystem {
  protected Spark climberMotor = new Spark(RobotMap.climberMotor);

  public final double CLIMB_LOWER_SPEED = -.2;
  public final double CLIMB_RAISE_SPEED = .2;

  public final double STOP_CLIMB = 0;

  public void raiseBar() {
      climberMotor.set(CLIMB_RAISE_SPEED);
  }

  public void lowerBar() {
      climberMotor.set(CLIMB_LOWER_SPEED);
  }

  public void stopBar() {
      climberMotor.set(STOP_CLIMB);
  }

  public void stopLift(double speed) {
    climberMotor.set(speed);
  }

  public void rampMotorDown(double speed) {
    climberMotor.set(speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
