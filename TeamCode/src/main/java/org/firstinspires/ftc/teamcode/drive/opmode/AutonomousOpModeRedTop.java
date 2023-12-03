package org.firstinspires.ftc.teamcode.drive.opmode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Testing Auto")
public class AutonomousOpModeRedTop extends LinearOpMode {
    private DcMotor lift = null;
    private int liftDelay = 1500;
    @Override
    public void runOpMode() {
        lift = hardwareMap.get(DcMotor.class, "lift");
        lift.setDirection(DcMotorSimple.Direction.REVERSE);
        lift.setPower(1);
        sleep(liftDelay);
        lift.setPower(0);
//        lift.setPower(-1);
//        sleep(liftDelay);
//        lift.setPower(0);
    }


}
