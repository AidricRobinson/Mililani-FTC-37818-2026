package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Commands.Manual.Test.*;
import org.firstinspires.ftc.teamcode.Subsystems.*;


@TeleOp(name="TestTeleOp")

public class TestTeleOp extends OpMode {
    //declaring subsystems and commands here
    private FlywheelSubsystem2 flywheelSubsystem2;
    private IntakeSubsystem intakeSubsystem;
    private StorageSubsystem storageSubsystem;
    private FlywheelCommand2 flywheelCommand2;
    private IntakeCommand intakeCommand;
    private StorageCommand storageCommand;
    private WheelSubsystem wheelSubsystem;





    public void init () {

        flywheelSubsystem2 = new FlywheelSubsystem2(this);
        intakeSubsystem = new IntakeSubsystem(this);
        storageSubsystem = new StorageSubsystem(this);
        flywheelCommand2 = new FlywheelCommand2(flywheelSubsystem2, gamepad1);
        intakeCommand = new IntakeCommand(intakeSubsystem, gamepad1);
        storageCommand = new StorageCommand(storageSubsystem, gamepad2);
        wheelSubsystem = new WheelSubsystem(this);

    }
    // //test comment

    @Override
    public void loop(){
        flywheelCommand2.operate(gamepad1);
        storageCommand.operate(gamepad2);
        wheelSubsystem.operate(gamepad1);

    }
    public void stop(){
        flywheelSubsystem2.shutdown();
        wheelSubsystem.shutdown();
    }
}