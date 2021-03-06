/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6751.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// User Interface Controllers
	public static final int pilot = 0;
	public static final int coPilot = 1;

	// Drivetrain motors
	public static int rightDriveMotor = 0;
	public static int leftDriveMotor = 1;

	// Motor for Arm
	public static int armMotor = 3;

	// Motor for Lift/Climb
	public static int climberMotor = 4;

	// Motor for Intake
	public static int rollerMotor = 5;	
}
