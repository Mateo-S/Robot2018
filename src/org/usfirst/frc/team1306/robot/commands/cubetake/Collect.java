package org.usfirst.frc.team1306.robot.commands.cubetake;

import org.usfirst.frc.team1306.robot.OI;
import org.usfirst.frc.team1306.robot.OI.Controller;
import org.usfirst.frc.team1306.robot.commands.CommandBase;
import org.usfirst.frc.team1306.robot.triggers.ControllerButton;

/**
 * @Collect - Command to spin the intake wheels inward; toggled.
 * @author Ethan Dong
 */
public class Collect extends CommandBase{
	
	@Override
	protected void execute() {
		cubetake.intake();
	}

	@Override
	protected boolean isFinished() {
		if(OI.getButtonStatus(Controller.P,ControllerButton.X)) {
			return false;
		} else {
			cubetake.stop();
			return true;
		}
	}
}
