// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  // Encoder encoder;
  CANSparkMax max;
  CANSparkMax maxTwo;

  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    this.max = new CANSparkMax(50, MotorType.kBrushless);
    this.maxTwo = new CANSparkMax(51, MotorType.kBrushless);
  }

  public void drive(double power) {
    this.max.set(power);
    this.maxTwo.set(power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
