package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// TODO: General test program, update with whatever tasks as necessary

@Autonomous(name="PositionTestBlue", group="linearOpMode")
public class PositionTestBlue extends AutonomousPrime2021 {
    @Override
    public void runOpMode(){
        mapObjects();
        waitForStart();

        while(!isStopRequested()){
            telemetry.addData("IMU Readout: ", getAngleOffset(90));
            telemetry.update();
            pause(2);
            leftEncoder(60, 0.5);
        }


        //hi logan -Jacob
    }
}