package org.usfirst.frc.team6751.robot.subsystems;

import org.usfirst.frc.team6751.robot.RobotMap;
import org.usfirst.frc.team6751.robot.commands.teleoperative.DriveTeleOp;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {

	protected Spark leftDriveMotor = new Spark(RobotMap.leftDriveMotor);
	protected Spark rightDriveMotor = new Spark(RobotMap.rightDriveMotor);

	public SpeedControllerGroup leftDriveTrain = new SpeedControllerGroup(leftDriveMotor);
	public SpeedControllerGroup rightDriveTrain = new SpeedControllerGroup(rightDriveMotor);

	public DifferentialDrive drivetrain = new DifferentialDrive(rightDriveTrain, leftDriveTrain);

	protected final double speedAdjustment = 0.70;
	protected final double rotationAdjustment = 0.60;

	public void driveArcade(double speed, double rotation) {
		// Tele-Op Driving
		drivetrain.arcadeDrive(speed * speedAdjustment, rotation * rotationAdjustment);
	}

	public void stopDrive() {
		leftDriveMotor.set(0);
		rightDriveMotor.set(0);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new DriveTeleOp());
	}

	public void test() {
		System.out.println("Buttons Work");
	}
}
