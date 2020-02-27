
package org.usfirst.frc.team6751.robot;

import org.usfirst.frc.team6751.robot.commands.Autonomous.AutonomousCommands;
import org.usfirst.frc.team6751.robot.subsystems.Arm;
import org.usfirst.frc.team6751.robot.subsystems.Climber;
import org.usfirst.frc.team6751.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6751.robot.subsystems.Roller;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoMode;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
	// Operator Interface (controllers)
	public static OI oi = new OI();

	// Drivetrain Subsystem 0 and 1
	public static final Drivetrain drivetrain = new Drivetrain();

	// Arm Subsystem 3
	public static final Arm arm = new Arm();

	// Climber Subsystem 4
	public static final Climber climber = new Climber();

	// Roller Subsystem 5
	public static final Roller roller = new Roller();

	protected AutonomousCommands autoCmds = new AutonomousCommands();

	@Override
	public void robotInit() {
		// Camera Setup
		UsbCamera usbCamera = CameraServer.getInstance().startAutomaticCapture();
		usbCamera.setVideoMode(VideoMode.PixelFormat.kYUYV, 640, 360, 60);
		usbCamera.setWhiteBalanceAuto();
	}

	@Override
	public void robotPeriodic() {
	}

	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
		autoCmds.start();
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
