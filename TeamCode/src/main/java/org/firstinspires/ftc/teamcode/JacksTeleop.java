package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp
public class JacksTeleop extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {


        int ArmMinLimit = -10;
        //int ArmMaxLimit = 2025;
        int ArmMaxLimit = 250;



        DcMotor frontLeft = hardwareMap.dcMotor.get("frontLeft");
        DcMotor backLeft = hardwareMap.dcMotor.get("backLeft");
        DcMotor frontRight = hardwareMap.dcMotor.get("frontRight");
        DcMotor backRight = hardwareMap.dcMotor.get("backRight");

        DcMotor intake = hardwareMap.dcMotor.get("intake");

//        DcMotorEx linearSlide = null;
//
//        linearSlide = hardwareMap.get(DcMotorEx.class, "linearSlide");
//        linearSlide.setDirection(DcMotorSimple.Direction.FORWARD);

        DcMotorEx linearSlide = hardwareMap.get(DcMotorEx.class,("linearSlide"));
        linearSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        linearSlide.setDirection(DcMotorSimple.Direction.REVERSE);
        linearSlide.setTargetPositionTolerance(30);

        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        double linearSlidePosition = 0;

        if(isStopRequested()) return;

        while(opModeIsActive()) {
            double coefficient = 1;
            double y = gamepad1.left_stick_y;
            double x = -gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double frontLeftPower = ((-y - x - rx) / denominator) * coefficient;
            double backLeftPower = ((-y + x - rx) / denominator) * coefficient;
            double frontRightPower = ((y - x - rx) / denominator) * coefficient;
            double backRightPower = ((y + x - rx) / denominator) * coefficient;

            frontLeft.setPower(frontLeftPower);
            frontRight.setPower(frontRightPower);
            backLeft.setPower(backLeftPower);
            backRight.setPower(backRightPower);

            linearSlide.setPower(gamepad1.right_stick_y);




            if(gamepad2.left_stick_y>0.1 || gamepad2.left_stick_y<-0.1){
                linearSlidePosition-=gamepad2.left_stick_y;

                int linearSlideCoefficient = 3;
                //"If gone above limit, don't" -Jacob
                if(linearSlidePosition>ArmMaxLimit && gamepad2.left_stick_y>0.1){
                    linearSlidePosition+=gamepad2.left_stick_y;
                    telemetry.addData("Past Position And Moving Wrong: ", true);
                }
                else if(linearSlidePosition<ArmMinLimit && gamepad2.left_stick_y<-0.1){
                    linearSlidePosition+=gamepad2.left_stick_y;
                    telemetry.addData("Past Position And Moving Wrong: ", true);
                }
                else {
                    linearSlide.setTargetPosition((int) (linearSlideCoefficient * linearSlidePosition));
                    linearSlide.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                    linearSlide.setPower(1);
                    telemetry.addData("Within Position: ", true);
                }
            }



            telemetry.addData("Linear Slide Current Pos:", linearSlide.getCurrentPosition());
            telemetry.addData("Linear Slide Target Pos:", linearSlide.getTargetPosition());
            telemetry.update();


        }
    }
}
