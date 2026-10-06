package org.firstinspires.ftc.teamcode.Commands.Autonomous;

import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.Subsystems.*;
import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.PIDController;

import java.util.Base64;

public class AutoDriveCommand {
    WheelSubsystem wheelSubsystem;
    PIDController pidController;
    double setPoint;
    public AutoDriveCommand(WheelSubsystem wheelSubsystem){
        this.wheelSubsystem = wheelSubsystem;
        this.pidController = new PIDController(0.0001, 0.05);
    }
    public void AutoDrive(double distanceInches){
        wheelSubsystem.resetEncoder();
        setPoint = distanceInches * Constants.EncoderConstants.kCOUNTS_PER_INCH;
        pidController.setSetPoint(setPoint);
        while(true){
            pidController.calculateError(wheelSubsystem.encoderReading()[0]);
            wheelSubsystem.setBLPower(pidController.calculateOutput());
            wheelSubsystem.setBRPower(pidController.calculateOutput());
            wheelSubsystem.setFLPower(pidController.calculateOutput());
            wheelSubsystem.setFRPower(pidController.calculateOutput());
            if(Math.abs(pidController.calculateError(wheelSubsystem.encoderReading()[0])) < 10){
                break;
            }
        }
        wheelSubsystem.resetEncoder();
        wheelSubsystem.shutdown();
    }
}
