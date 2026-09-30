package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class StorageSubsystem {
    DcMotorEx StorageMotor;
    public  StorageSubsystem(OpMode opMode){
        StorageMotor = opMode.hardwareMap.get(DcMotorEx.class, "Motor");
    }
    public void setStoragePower(double power){
        StorageMotor.setPower(power);

    }
    public void shutdown(){
        StorageMotor.setPower(0);
    }

}
