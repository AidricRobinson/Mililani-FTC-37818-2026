//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//
//import org.firstinspires.ftc.teamcode.Commands.Manual.FlywheelCommand;
//import org.firstinspires.ftc.teamcode.Subsystems.FlywheelSubsystem;
//
//
//@TeleOp(name="TestTeleOp")
//
//public class TestTeleOp extends OpMode {
//    //declaring subsystems and commands here
//    private FlywheelSubsystem flywheelSubsystem;
//    private FlywheelCommand flywheelCommand;
//
//    private IntakeSubsystem intakeSubsystem;
//    private IntakeCommand intakeCommand;
//
//    private FlowerSubsystem flowerSubsystem;
//    private FlowerCommand flowerCommand;
//
//    private FeederSubsystem feederSubsystem;
//    private FeederCommand feederCommand;
//
//    private MecanumDriveSubsystem mecanumDriveSubsystem;
//
//
//    //When you 8 initialize
//    public void init () {
//        mecanumDriveSubsystem = new MecanumDriveSubsystem(this.hardwareMap,this);
//
//        flywheelSubsystem = new FlywheelSubsystem(this);
//        flywheelCommand = new FlywheelCommand(flywheelSubsystem, gamepad1);
//
//        intakeSubsystem = new IntakeSubsystem(this);
//        intakeCommand = new IntakeCommand(intakeSubsystem, gamepad1);
//
//        feederSubsystem = new FeederSubsystem(this);
//        feederCommand = new FeederCommand(feederSubsystem, gamepad1);
//
//        flowerSubsystem = new FlowerSubsystem(this);
//        flowerCommand = new FlowerCommand(flowerSubsystem, gamepad1);
//    }

// // test comment
//
//    @Override
//    public void loop(){
//        mecanumDriveSubsystem.operate(gamepad1, telemetry);
//        flywheelCommand.operate(gamepad1);
//        intakeCommand.operate(gamepad1);
//        feederCommand.operate(gamepad1);
//        flowerCommand.operate(gamepad1);
//    }
//    public void stop(){
//        mecanumDriveSubsystem.shutdown();
//        flywheelSubsystem.shutdown();
//        intakeSubsystem.shutdown();
//        flowerSubsystem.shutdown();
//        feederSubsystem.shutdown();
//    }
//}