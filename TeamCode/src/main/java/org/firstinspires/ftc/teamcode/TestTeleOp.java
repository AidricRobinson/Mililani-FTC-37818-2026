package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Commands.Manual.Test.*;
import org.firstinspires.ftc.teamcode.Subsystems.*;


@TeleOp(name="TestTeleOp")

public class TestTeleOp extends OpMode {
    //declaring subsystems and commands here
    private FlywheelSubsystem2 flywheelSubsystem2;
    private FlywheelCommand2 flywheelCommand2;





    public void init () {

        flywheelSubsystem2 = new FlywheelSubsystem2(this);
        flywheelCommand2 = new FlywheelCommand2(flywheelSubsystem2, gamepad1);


    }
    // //test comment

    @Override
    public void loop(){
        flywheelCommand2.operate(gamepad1);

    }
    public void stop(){
        flywheelSubsystem2.shutdown();

    }
}