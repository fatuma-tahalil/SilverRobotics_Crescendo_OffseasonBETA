// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.Constants.driverConstants;
import frc.robot.subsystems.DrivetrainSubsystem;

public class DriveCommand extends Command {
  /** Creates a new DriveCommand. */
  DrivetrainSubsystem drivetrain;

  // The commands constructor
  public DriveCommand(DrivetrainSubsystem drivetrainsubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
  }


// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.DriveCommand(RobotContainer.driverController, driverConstants.driveSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //drivetrain.stop();
  }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
