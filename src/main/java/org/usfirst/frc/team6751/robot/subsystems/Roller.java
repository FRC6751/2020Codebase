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
public class Roller extends Subsystem {
	protected Spark rollerMotor = new Spark(RobotMap.rollerMotor);

	protected final double INTAKE_LOWER_SPEED = -.4;
	protected final double INTAKE_RAISE_SPEED = .2;

	protected final double INTAKE_SPEED = .7;

	protected final double SHOOT_SPEED = -.7;

	protected final double INTAKE_STOP = 0;

	public void increaseRollerSpeed() {
		rollerMotor.set(INTAKE_RAISE_SPEED);
	}

	public void decreaseRollerSpeed() {
		rollerMotor.set(INTAKE_LOWER_SPEED);
	}

	public void stopRoller() {
		rollerMotor.set(INTAKE_STOP);
	}

	@Override
	public void initDefaultCommand() {
		// Not setting due to the button commands handling command processing
		//setDefaultCommand(new IntakeCommands());
	}

/*
	public void activateIntake() {
		if (!isArmReadyForIntake()) {
			//TODO: not sure what i am doing here
		}
		intakeMotor.set(INTAKE_SPEED);
	}

	public void activateShoot() {
		if (!isArmReadyForShoot()) {
			//TODO: not sure what i am doing here
		}
		intakeMotor.set(SHOOT_SPEED);
	}

	public void deactivateIntake() {
		intakeMotor.set(INTAKE_STOP);
	}

*/
	/**
	 * Method to determine if the Arm is in position to perform a Shoot
	 * @return
	 */
/*
	protected boolean isArmReadyForShoot() {
		boolean retVal = false;
		// I am assuming that positon will return 1.0 when the arm is up
		if (armMotor.getPosition() >= 1.0) {
			retVal = true;
		}

		return retVal;
	}
*/
	/**
	 * Method to determine if the Arm is in position to perform Intake
	 * @return
	 */
/*
	protected boolean isArmReadyForIntake() {
		boolean retVal = false;
		// I am assuming that positon will return 1.0 when the arm is up
		if (armMotor.getPosition() <= 0.0) {
			retVal = true;
		}

		return retVal;
	}
*/
}
