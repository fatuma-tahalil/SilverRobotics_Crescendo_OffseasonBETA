// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

// Automatically from template
import frc.robot.Constants.OperatorConstants;

import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
//import edu.wpi.first.cameraserver.CameraServer;
//import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj2.command.RunCommand;
//import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
//import edu.wpi.first.wpilibj2.command.button.Trigger;

import frc.robot.commands.DriveCommand;

import frc.robot.subsystems.DrivetrainSubsystem;



/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer{
  // The robot's subsystems and commands are defined here...

  // Imports an object of the drive train subsystem
  private final DrivetrainSubsystem drivetrainSubsystem;
  private final DriveCommand driveCommand;
  private final ShooterSubsystem shooterSubsystem;
  public static Joystick driverController;
  //*  Replace with CommandPS4Controller or CommandJoystick if needed

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    driverController = new Joystick(OperatorConstants.controllerPort);

    drivetrainSubsystem = new DrivetrainSubsystem();
    driveCommand = new DriveCommand(drivetrainSubsystem);
    shooterSubsystem = new ShooterSubsystem();
    // Sets the camera
    /*UsbCamera camera2UsbCamera = CameraServer.startAutomaticCapture();
    camera2UsbCamera.setResolution(230, 230); */

    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *

   */
  public void getAutonomousCommand() {}
}
