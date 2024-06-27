// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
  
    public static final int controllerPort = 1;
    
  }
  public static class autoConstants{
    // Input auto constants
  }
  public static class driverConstants{
    public static final int rightUpDeviceID = 1; 
    public static final int leftUpDeviceID = 3;
    public static final int rightDownDeviceID = 2; 
    public static final int leftDownDeviceID = 4;

    public static final int controllerPort = 1;
    public static final double driveSpeed = 1.00;
    public static final int axisX = 0;
    public static final int axisY = 1;
    public static final double rate_limit = 0.5;
    public static final double stop = 0;

  }
  public static class intakeConstants{
    public static final int intakeID = 8;
  }
  public static class climberConstants{
    // Input climber constants

  }
  public static class shooterConstants{
    public static final int shooterUpDeviceID = 5; 
    public static final int shooterDownDeviceID = 6;

    public static double shooterSpeed = 1.00;
  }
}
