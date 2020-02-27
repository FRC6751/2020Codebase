
package org.usfirst.frc.team6751.robot;

import com.team6751.util.LogitechOp;
import com.team6751.util.PS4Gamepad;

import org.usfirst.frc.team6751.robot.commands.Teleoperative.ArmCommand;
import org.usfirst.frc.team6751.robot.commands.Teleoperative.ClimberCommand;
import org.usfirst.frc.team6751.robot.commands.Teleoperative.RollerCommand;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	// Calls the Gamepad Classes: Defines gp and cp for the robot
	private PS4Gamepad gp = new PS4Gamepad(RobotMap.pilot);
	private LogitechOp cp = new LogitechOp(RobotMap.coPilot);
	// private final Operation operation = new Operation();

	// Creates a Button Object from the Controllers
	// Pilot
	Button buttonTriangle = gp.getButtonTriangle();

	Button buttonSquare = gp.getButtonSquare();

	Button buttonCircle = gp.getButtonCircle();

	Button buttonX = gp.getButtonX();

	Button buttonOptions = gp.getOptionsButton();

	Button buttonShare = gp.getShareButton();

	Button buttonStart = gp.getStartButton();

	Button buttonPad = gp.getButtonPad();

	Button L1 = gp.getL1();

	Button R1 = gp.getR1();

	Button L2 = gp.getL2();

	Button R2 = gp.getR2();

	Button L3 = gp.getL3();

	Button R3 = gp.getR3();

	// CoPilot
	Button cbuttonA = cp.getButtonA();
	Button cbuttonB = cp.getButtonB();
	Button cbuttonY = cp.getButtonY();
	Button cbuttonX = cp.getButtonX();
	Button cbuttonStart = cp.getStartButton();
	Button cLB = cp.getLB();
	Button cRB = cp.getRB();

	public OI() {
		boolean increaseSpeed = true;
		R1.whileHeld(new ArmCommand(increaseSpeed));
		L1.whileHeld(new RollerCommand(increaseSpeed));
		buttonTriangle.whileHeld(new ClimberCommand(increaseSpeed));

		increaseSpeed = false;
		R2.whileHeld(new ArmCommand(increaseSpeed));
		L2.whileHeld(new RollerCommand(increaseSpeed));
		buttonX.whileHeld(new ClimberCommand(increaseSpeed));
	}

	// Returns Controller Data for use with certain Methods
	protected PS4Gamepad getGamepad() {
		return gp;
	}

	public double getSpeed() {
		return gp.getLeftYAxis();
	}

	public double getRotation() {
		return gp.getRightXAxis();
	}

	protected LogitechOp getCopad() {
		return cp;
	}
}