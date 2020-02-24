package org.usfirst.frc.team6751.robot.subsystems;

import com.team6751.util.PS4Gamepad;

import org.usfirst.frc.team6751.robot.RobotMap;
import org.usfirst.frc.team6751.robot.commands.DriveTeleOp;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public Spark leftDriveMotor = new Spark(RobotMap.leftDriveMotor);
	public Spark rightDriveMotor = new Spark(RobotMap.rightDriveMotor);

	public SpeedControllerGroup leftDriveTrain = new SpeedControllerGroup(leftDriveMotor);
	public SpeedControllerGroup rightDriveTrain = new SpeedControllerGroup(rightDriveMotor);

	public DifferentialDrive drivetrain = new DifferentialDrive(rightDriveTrain, leftDriveTrain);

	// public Encoder driveEncoder = new Encoder(RobotMap.driveEncoderA,
	// RobotMap.driveEncoderB);

	public void motorSafety(boolean enabled) {
		leftDriveMotor.setSafetyEnabled(enabled);
		rightDriveMotor.setSafetyEnabled(enabled);

	}

	public void driveTeleOp(PS4Gamepad gp) {
		// Tele-Op Driving
		drivetrain.arcadeDrive(gp.getLeftYAxis() * -.95, gp.getRightXAxis() * .7);
	}

	public void driveForward() {
		for (int x = 1 ; x < 5; x++){
		int ramp = 4;
		leftDriveMotor.set(.5/ramp);
		rightDriveMotor.set(.5/ramp);
		ramp--;
		Timer.delay(.15);
		}
	}
		

	

	public void driveBackward() {
		for (int x = 1 ; x < 5; x++){
			int ramp = 4;
			leftDriveMotor.set(-.5/ramp);
			rightDriveMotor.set(-.5/ramp);
			ramp--;
			Timer.delay(.15);
		}

	}

	public void turnRightTank() {
		leftDriveMotor.set(-.75);
		rightDriveMotor.set(0);

	}

	public void turnLeftTank() {
		leftDriveMotor.set(0);
		rightDriveMotor.set(-.75);

	}

	public void turnLeft() {
		leftDriveMotor.set(-.75);
		rightDriveMotor.set(.75);
	}

	public void turnRight() {
		leftDriveMotor.set(.75);
		rightDriveMotor.set(-.75);
	}

	public void stopDrive() {
		leftDriveMotor.set(0);
		rightDriveMotor.set(0);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new DriveTeleOp());
	}
}
