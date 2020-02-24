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
public class Climb extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Spark liftMotor = new Spark(RobotMap.liftMotor);

  public final double RAMP_LOWER_SPEED = -.4;
  public final double RAMP_RAISE_SPEED = .2;

  public final double STOP_LIFT = 0;

  public void stopLift(double speed){
		liftMotor.set(speed);
	}

	public void rampMotorDown(double speed) {
		liftMotor.set(speed);
	}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
