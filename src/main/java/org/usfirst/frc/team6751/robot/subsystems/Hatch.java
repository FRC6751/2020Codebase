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
public class Hatch extends Subsystem {
	public Spark hatchMotor = new Spark(RobotMap.hatchMotor);

	public final double HATCH_UP_SPEED = -.5;
	public final double HATCH_DOWN_SPEED = .5;
	public final double STOP_HATCH = 0;

	public void hatchMotorUp(double speed) {
		hatchMotor.set(speed);
	}

	public void hatchMotorDown(double speed) {
		hatchMotor.set(speed);
	}

	public void stopHatch(){
		hatchMotor.set(0);
	}

  @Override
  public void initDefaultCommand() {
		
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
