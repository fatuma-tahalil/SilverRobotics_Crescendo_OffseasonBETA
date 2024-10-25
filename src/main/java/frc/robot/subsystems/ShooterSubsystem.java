// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
// I don't really understand why it needs to be static and include the ".*"
import static frc.robot.Constants.shooterConstants.*;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  private final static CANSparkMax shooterUpMotor = new CANSparkMax(shooterUpDeviceID, MotorType.kBrushed);
  private final static CANSparkMax shooterDownMotor = new CANSparkMax(shooterDownDeviceID, MotorType.kBrushed);
  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }

  public static Command waitSeconds(double prepareShootingTime){
    shooterUpMotor.set(shooterSpeed);
    return(null);
  }

  public static void shoot(){
    waitSeconds(waitTime);
    shooterDownMotor.set(shooterSpeed);
  }

  public void stop() {
    shooterUpMotor.set(stop);
    shooterDownMotor.set(stop);
  }
}
