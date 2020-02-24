
package org.usfirst.frc.team6751.robot;

import com.team6751.util.LogitechOp;
import com.team6751.util.PS4Gamepad;

import org.usfirst.frc.team6751.robot.commands.Ramp;
import org.usfirst.frc.team6751.robot.commands.hatchMotor;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	// Calls the Gamepad Classes: Defines gp and cp for the robot
	private PS4Gamepad gp = new PS4Gamepad(RobotMap.pilot);
	private LogitechOp cp = new LogitechOp(RobotMap.coPilot);

	// Returns Controller Data for use with certain Methods
	public PS4Gamepad getGamepad() {
		return gp;
	}

	public LogitechOp getCopad() {
		return cp;
	}

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

		//Hatch
		R1.whileHeld(new hatchMotor(Robot.hatch.HATCH_DOWN_SPEED));
		R2.whileHeld(new hatchMotor(Robot.hatch.HATCH_UP_SPEED));
		
		L1.whileHeld(new Ramp(Robot.climb.RAMP_LOWER_SPEED));
		L2.whileHeld(new Ramp(Robot.climb.RAMP_RAISE_SPEED));
		


	}
	
}