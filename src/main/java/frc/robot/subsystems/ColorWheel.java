/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ColorWheel extends SubsystemBase {
  public static WPI_TalonSRX colorWheelMotor = new WPI_TalonSRX(Constants.colorWheelMotor);
  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  /*private final ColorSensorV3 colorSensor = new ColorSensorV3(i2cPort);
  private final ColorMatch m_colorMatcher = new ColorMatch();
  private final Color kBlueTarget = ColorMatch.makeColor(0.143, 0.427, 0.429);
  private final Color kGreenTarget = ColorMatch.makeColor(0.197, 0.561, 0.240);
  private final Color kRedTarget = ColorMatch.makeColor(0.561, 0.232, 0.114);
  private final Color kYellowTarget = ColorMatch.makeColor(0.361, 0.524, 0.113);
  private Color detectedColor;
  private String colorString;
  private ColorMatchResult match;*/
  private static double position;

  public ColorWheel() {
    /*-------------------------------------------------------------------------*/
    /* Color Sensor WILL NOT WORK if you do not re-deploy code on robot startup */
    /*-------------------------------------------------------------------------*/
    /*
    colorWheelMotor.configFactoryDefault();

    colorWheelMotor.setNeutralMode(NeutralMode.Brake);

    colorWheelMotor.setInverted(false);

    m_colorMatcher.addColorMatch(kBlueTarget);
    m_colorMatcher.addColorMatch(kGreenTarget);
    m_colorMatcher.addColorMatch(kRedTarget);
    m_colorMatcher.addColorMatch(kYellowTarget);
    */
  }

  public void spin(double _speed) {
    colorWheelMotor.set(_speed);
  }
  public void reset(){
    colorWheelMotor.setSelectedSensorPosition(0);
  }

  public static double getPosition() {
    position = Math.abs(colorWheelMotor.getSelectedSensorPosition() / Constants.quadrativeEncoderRotation);
    return position;
  }

 

  public String getColor() {
    /*
    detectedColor = colorSensor.getColor();
    match = m_colorMatcher.matchClosestColor(detectedColor);

    if (match.color == kBlueTarget) {
      colorString = "B";
    } else if (match.color == kRedTarget) {
      colorString = "R";
    } else if (match.color == kGreenTarget) {
      colorString = "G";
    } else if (match.color == kYellowTarget) {
      colorString = "Y";
    } else {
      colorString = "Unknown???????";
    }

    return colorString;
    */
    return null;
  }

  @Override
  public void periodic() {
    /*
    detectedColor = colorSensor.getColor();
    match = m_colorMatcher.matchClosestColor(detectedColor);

    if (match.color == kBlueTarget) {
      colorString = "Blue";
    } else if (match.color == kRedTarget) {
      colorString = "Red";
    } else if (match.color == kGreenTarget) {
      colorString = "Green";
    } else if (match.color == kYellowTarget) {
      colorString = "Yellow";
    } else {
      colorString = "Unknown???????";
    }
    */
  }
}
