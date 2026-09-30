package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Commands.Manual.Test.*;
import org.firstinspires.ftc.teamcode.Subsystems.*;

@TeleOp(name="TestTeleopStorage")
public class TestTeleopStorage extends OpMode {
    private StorageSubsystem storageSubsystem;
    private StorageCommand storageCommand;

    public void init(){
        storageSubsystem = new StorageSubsystem(this);
        storageCommand = new StorageCommand(storageSubsystem, gamepad2);
    }
    @Override
    public void loop(){
        storageCommand.operate(gamepad2);

    }
    public void stop() {
        storageSubsystem.shutdown();
    }
}

