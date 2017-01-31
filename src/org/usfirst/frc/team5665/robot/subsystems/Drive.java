package org.usfirst.frc.team5665.robot.subsystems;

import org.usfirst.frc.team5665.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private RobotDrive drive = RobotMap.driveRobotDrive4;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void arcadeDrive(double xAxis, double yAxis) {
        drive.arcadeDrive(xAxis, yAxis);
    }
}

