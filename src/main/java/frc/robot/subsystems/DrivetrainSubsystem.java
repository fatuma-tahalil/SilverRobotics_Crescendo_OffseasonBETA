// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

//import edu.wpi.first.math.filter.SlewRateLimiter;

import frc.robot.Constants.driverConstants;
import static frc.robot.Constants.driverConstants.*;


public class DrivetrainSubsystem {

 //private static SlewRateLimiter filter;

  // Do not initialize motors and drivetrain in the constructor!
  private final CANSparkMax rightUpMotor = new CANSparkMax(rightUpDeviceID, MotorType.kBrushed);//kBrushless
  private final CANSparkMax rightDownMotor = new CANSparkMax(rightDownDeviceID, MotorType.kBrushed);
  private final CANSparkMax leftUpMotor = new CANSparkMax(leftUpDeviceID, MotorType.kBrushed);
  private final CANSparkMax leftDownMotor = new CANSparkMax(leftDownDeviceID, MotorType.kBrushed);

  private final DifferentialDrive m_drivetrain = new DifferentialDrive(leftUpMotor, rightUpMotor);

  public DrivetrainSubsystem() {

   // The back motors automatically follow the front motors
    rightDownMotor.follow(rightUpMotor);
    leftDownMotor.follow(leftUpMotor);
    
    rightUpMotor.restoreFactoryDefaults();
    leftUpMotor.restoreFactoryDefaults();
    rightDownMotor.restoreFactoryDefaults();
    leftDownMotor.restoreFactoryDefaults();


    //filter = new SlewRateLimiter(rate_limit);
  };

  public void DriveCommand(Joystick controller, double speed) {
    // Limits the increments that speed can change for smoother driving
    //double speed_limited = filter.calculate(-drivercontroller.getRawAxis(axisX));
    m_drivetrain.arcadeDrive(-controller.getRawAxis(driverConstants.axisY)*speed, controller.getRawAxis(driverConstants.axisX)*speed );
  }

  public void periodic() {
    // This method will be called once per scheduler run

    }

  public void stop() {
    m_drivetrain.arcadeDrive(driverConstants.stop, driverConstants.stop);
  }
}
