package org.firstinspires.ftc.teamcode.Subsystems;
import androidx.appcompat.widget.ButtonBarLayout;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;

public class WheelSubsystem {

    DcMotorEx FLMotor;
    DcMotorEx FRMotor;
    DcMotorEx BLMotor;
    DcMotorEx BRMotor;

    public WheelSubsystem(OpMode opMode) {
        FLMotor = opMode.hardwareMap.get(DcMotorEx.class, "FL");
        FRMotor = opMode.hardwareMap.get(DcMotorEx.class, "FR");
        BLMotor = opMode.hardwareMap.get(DcMotorEx.class, "BL");
        BRMotor = opMode.hardwareMap.get(DcMotorEx.class, "BR");
    }
    public void setFLPower(double power){
        FLMotor.setPower(power);
    }
    public void setFRPower(double power){
        FRMotor.setPower(power);
    }
    public void setBLPower(double power){
        BLMotor.setPower(power);
    }
    public void setBRPower(double power){
        BRMotor.setPower(power);
    }

    public void operate(Gamepad gamepad) {
        double y = gamepad.left_stick_y;
        double x = gamepad.left_stick_x;
        double rx = gamepad.right_stick_x;

        if (gamepad.right_bumper){
            FLMotor.setPower((y + x + rx)/2);
            FRMotor.setPower((y - x - rx)/2);
            BLMotor.setPower((y - x + rx)/2);
            BRMotor.setPower((y + x - rx)/2);
        }
        else {
            FLMotor.setPower(y + x + rx);
            FRMotor.setPower(y - x - rx);
            BLMotor.setPower(y - x + rx);
            BRMotor.setPower(y + x - rx);
        }

    }




    public void shutdown(){
        FLMotor.setPower(0);
        FRMotor.setPower(0);
        BLMotor.setPower(0);
        BRMotor.setPower(0);
    }

}
