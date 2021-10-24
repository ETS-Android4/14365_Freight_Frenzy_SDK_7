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
            //telemetry.addData("IMU Readout: ", getAngleOffset(90));
            //telemetry.update();
            forwardEncoder(10, 0.1);
            pause(2);
        }


        //hi logan -Jacob
    }
}