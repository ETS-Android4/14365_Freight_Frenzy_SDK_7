package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class EmptyTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor frontLeft = hardwareMap.dcMotor.get("frontLeft");
        DcMotor backLeft = hardwareMap.dcMotor.get("backLeft");
        DcMotor frontRight = hardwareMap.dcMotor.get("frontRight");
        DcMotor backRight = hardwareMap.dcMotor.get("backRight");

        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        DcMotor intake = hardwareMap.dcMotor.get("intake");
        //CRServo intakeDrop = hardwareMap.crservo.get("intakeDrop");

        //DcMotor duckSpinny = hardwareMap.dcMotor.get("duckSpinny");

        waitForStart();

        if(isStopRequested()) return;

        while(opModeIsActive()) {
            double coefficient = 1;
            double y = gamepad1.left_stick_y;
            double x = -gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double frontLeftPower = (-y - x - rx) / denominator;
            double backLeftPower = (-y + x - rx) / denominator;
            double frontRightPower = (y - x - rx) / denominator;
            double backRightPower = (y + x - rx) / denominator;

            if(gamepad1.right_trigger > 0.1) {
                coefficient = 0.5;
            }

            frontLeft.setPower(coefficient * frontLeftPower);
            frontRight.setPower(coefficient * frontRightPower);
            backLeft.setPower(coefficient * backLeftPower);
            backRight.setPower(coefficient * backRightPower);

            if(gamepad1.left_trigger > 0.1) {
                intake.setPower(1);
            } else if(gamepad1.left_trigger == 0) {
                intake.setPower(0);
            }
            if(gamepad1.left_bumper) {
                intake.setPower(-1);
            } else if(!gamepad1.left_bumper) {
                intake.setPower(0);
            }
            /*if(gamepad1.dpad_up) {
                intakeDrop.setPower(1);
            }
            else if(gamepad1.dpad_down) {
                intakeDrop.setPower(-1);
            } else{
                intakeDrop.setPower(0);
            }*/

            /*if(gamepad1.left_trigger > 0.1) {
                duckSpinny.setPower(1);
            } else {
                duckSpinny.setPower(0);
            }*/
        }
    }
}
