// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.lisaacademy.robotics.theTerminator.subsystems;
import org.lisaacademy.robotics.theTerminator.RobotMap;
import org.lisaacademy.robotics.theTerminator.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class DriveSystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANJaguar leftRearJaguar = RobotMap.driveSystemLeftRearJaguar;
    CANJaguar leftFrontJaguar = RobotMap.driveSystemLeftFrontJaguar;
    CANJaguar rightRearJaguar = RobotMap.driveSystemRightRearJaguar;
    CANJaguar rightFrontJaguar = RobotMap.driveSystemRightFrontJaguar;
    RobotDrive robotDrive = RobotMap.driveSystemRobotDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public RobotDrive drive = robotDrive;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Drive());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
}
