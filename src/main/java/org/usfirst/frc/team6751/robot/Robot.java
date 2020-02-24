
package org.usfirst.frc.team6751.robot;

import org.usfirst.frc.team6751.robot.commands.DriveTeleOp;
import org.usfirst.frc.team6751.robot.subsystems.Climb;
import org.usfirst.frc.team6751.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6751.robot.subsystems.Hatch;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoMode;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
	public static OI oi;
	public static final Drivetrain drivetrain = new Drivetrain();
	public static final Climb climb = new Climb();
	public static final Hatch hatch = new Hatch();

	// Auto Setup
	Command autonomousCommand;
	SendableChooser<CommandGroup> chooser;

	@Override
	public void robotInit() {
		drivetrain.motorSafety(false);
		oi = new OI();
		chooser = new SendableChooser<CommandGroup>();

		// Auto Chooser
		SmartDashboard.putData("Auto Mode", chooser);

				//Camera Setup

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

		autonomousCommand = chooser.getSelected();

		if (autonomousCommand != null) {
			autonomousCommand.start();
		}
		// setDefaultLights();
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
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}

		// setDefaultLights();
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
