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
public class Arm extends Subsystem {
	protected Spark armMotor = new Spark(RobotMap.armMotor);

	protected final double ARM_LOWER_SPEED = -.4;
	protected final double ARM_RAISE_SPEED = .2;
	protected final double ARM_STOP = 0;

	protected final double RAISE_LOWER_SPEED = .2;
	public Arm() {
		// TODO
	}

	public void raiseArm() {
		armMotor.set(RAISE_LOWER_SPEED);
	}

	public void lowerArm() {
		armMotor.set(-RAISE_LOWER_SPEED);
	}

	public void increaseArmSpeed() {
		armMotor.set(ARM_RAISE_SPEED);
	}

	public void decreaseArmSpeed() {
		armMotor.set(ARM_LOWER_SPEED);
	}

	public void stopArm() {
		armMotor.set(ARM_STOP);
    }

    public boolean atMaximumHeight() {
        return false;
    }

    public boolean atMinimumHeight() {
        return false;
    }
    
    @Override
	public void initDefaultCommand() {
		// Not setting due to the button commands handling command processing
		//setDefaultCommand(new IntakeCommands());
	}


}
