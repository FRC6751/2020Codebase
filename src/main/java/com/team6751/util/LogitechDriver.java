package com.team6751.util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Contains functions for use with the Playstation 4 controller. Credit to these
 * guys
 * 
 * @author Thomas Floyd tefloyd1215@att.net and
 * @author Joshua Lewis joshlewi14@gmail.com
 * 
 */
public class LogitechDriver extends Joystick {
	// Gamepad axis ports
	private static final int AXIS_LEFT_X = 0;
	private static final int AXIS_LEFT_Y = 1;
	private static final int AXIS_RIGHT_X = 4;
	private static final int AXIS_RIGHT_Y = 5;
	private static final int AXIS_DPAD = 5;

	// Gamepad buttons
	public static final int BUTTON_X = 3;
	public static final int BUTTON_A = 1;
	public static final int BUTTON_Y = 4;
	public static final int BUTTON_B = 2;
	public static final int BUTTON_LB = 5;
	public static final int BUTTON_RB = 6;
	private static final int BUTTON_BACK = 7;
	private static final int BUTTON_START = 8;
	private static final int BUTTON_L3 = 9;
	private static final int BUTTON_R3 = 10;

	// private static final int BUTTON_MODE = -1;
	// private static final int BUTTON_LOGITECH = -1;

	/**
	 * Constructor that creates a Joystick object.
	 */
	public LogitechDriver(int gamepadPort) {
		super(gamepadPort);
	}

	/**
	 * Returns the X position of the left stick.
	 */
	public double getLeftXAxis() {
		return getRawAxis(AXIS_LEFT_X);
	}

	/**
	 * Returns the X position of the right stick.
	 */
	public double getRightXAxis() {
		return getRawAxis(AXIS_RIGHT_X);
	}

	/**
	 * Returns the Y position of the left stick.
	 */
	public double getLeftYAxis() {
		return getRawAxis(AXIS_LEFT_Y);
	}

	/**
	 * Returns the Y position of the right stick.
	 */
	public double getRightYAxis() {
		return getRawAxis(AXIS_RIGHT_Y);
	}

	/**
	 * Checks whether Button X is being pressed and returns true if it is.
	 */

	public boolean getButtonStateX() {
		return getRawButton(BUTTON_X);
	}

	/**
	 * Checks whether Button Circle is being pressed and returns true if it is.
	 */
	public boolean getButtonStateB() {
		return getRawButton(BUTTON_B);
	}

	/**
	 * Checks whether Button Sqaure is being pressed and returns true if it is.
	 */
	public boolean getButtonStateY() {
		return getRawButton(BUTTON_Y);
	}

	/**
	 * Checks whether Button Triangle is being pressed and returns true if it is.
	 */
	public boolean getButtonStateA() {
		return getRawButton(BUTTON_A);
	}

	/**
	 * Returns an object of Button A.
	 */

	public JoystickButton getButtonX() {
		return new JoystickButton(this, BUTTON_X);
	}

	/**
	 * Returns an object of Button B.
	 */
	public JoystickButton getButtonY() {
		return new JoystickButton(this, BUTTON_Y);
	}

	/**
	 * Returns an object of Button X.
	 */
	public JoystickButton getButtonB() {
		return new JoystickButton(this, BUTTON_B);
	}

	/**
	 * Returns an object of Button Y.
	 */
	public JoystickButton getButtonA() {
		return new JoystickButton(this, BUTTON_A);
	}

	/**
	 * Return the DPad axis positions.
	 */
	public double getDPadX() {
		return getRawAxis(AXIS_DPAD);
	}

	/**
	 * DPad Left and Right only WPILIB cannot access the vertical axis of the
	 * Playstation 4
	 */

	public boolean getDPadLeft() {
		double x = getDPadX();
		return (x < -0.5);
	}

	public boolean getDPadRight() {
		double x = getDPadX();
		return (x > 0.5);
	}

	/**
	 * Gets the state of the Start button
	 * 
	 * @return the state of the Start button
	 */

	public JoystickButton getStartButton() {
		return new JoystickButton(this, BUTTON_START);
	}

	public JoystickButton getBackButton() {
		return new JoystickButton(this, BUTTON_BACK);
	}

	/**
	 * Gets the state of the left stick button
	 * 
	 * @return the state of the left stick button
	 */
	public JoystickButton getL3() {
		return new JoystickButton(this, BUTTON_L3);
	}

	/**
	 * Gets the state of the right stick button
	 * 
	 * @return the state of the right stick button
	 */
	public JoystickButton getR3() {
		return new JoystickButton(this, BUTTON_R3);
	}

	/**
	 * Gets the state of the right trigger
	 * 
	 * @return the state of the right trigger
	 */
	public JoystickButton getLB() {
		return new JoystickButton(this, BUTTON_LB);
	}

	public JoystickButton getRB() {
		return new JoystickButton(this, BUTTON_RB);
	}

}