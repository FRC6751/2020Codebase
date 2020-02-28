
package org.usfirst.frc.team6751.robot;

import com.team6751.util.LogitechOp;
import com.team6751.util.PS4Gamepad;

import org.usfirst.frc.team6751.robot.commands.teleoperative.ArmCommand;
import org.usfirst.frc.team6751.robot.commands.teleoperative.ClimberCommand;
import org.usfirst.frc.team6751.robot.commands.teleoperative.RollerCommand;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	// Calls the Gamepad Classes: Defines gp and cp for the robot
	private PS4Gamepad gp = new PS4Gamepad(RobotMap.pilot);
	private LogitechOp cp = new LogitechOp(RobotMap.coPilot);

	Button climberUpButton = gp.getButtonTriangle();
	Button climberDownButton = gp.getButtonX();

	Button rollerForwardButton = gp.getL1();
	Button rollerBackwardButton = gp.getL2();

	Button armUpButton = gp.getR1();
	Button armDownButton = gp.getR2();

	public OI() {
		boolean increaseSpeed = true;
		armUpButton.whileHeld(new ArmCommand(increaseSpeed));
		rollerForwardButton.whileHeld(new RollerCommand(increaseSpeed));
		climberUpButton.whileHeld(new ClimberCommand(increaseSpeed));

		increaseSpeed = false;
		armDownButton.whileHeld(new ArmCommand(increaseSpeed));
		rollerBackwardButton.whileHeld(new RollerCommand(increaseSpeed));
		climberDownButton.whileHeld(new ClimberCommand(increaseSpeed));
	}

	public double getSpeed() {
		return -gp.getLeftYAxis();
	}

	public double getRotation() {
		return gp.getRightXAxis();
	}
}