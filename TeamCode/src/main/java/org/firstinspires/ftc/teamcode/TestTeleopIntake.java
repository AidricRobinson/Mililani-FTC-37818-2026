package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Commands.Manual.Test.*;
import org.firstinspires.ftc.teamcode.Subsystems.*;

@TeleOp(name="TestTeleopIntake")

public class TestTeleopIntake extends OpMode {
    private IntakeSubsystem intakeSubsystem;
    private IntakeCommand intakeCommand;

    public void init(){
        intakeSubsystem = new IntakeSubsystem(this);
        intakeCommand = new IntakeCommand(intakeSubsystem, gamepad1);
    }
    @Override
    public void loop(){
        intakeCommand.operate(gamepad1);

    }
    public void stop() {
        intakeSubsystem.shutdown();
    }
}
