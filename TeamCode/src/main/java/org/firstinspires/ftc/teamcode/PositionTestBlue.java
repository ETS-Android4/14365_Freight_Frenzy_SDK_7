package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// TODO: General test program, update with whatever tasks as necessary

@Autonomous(name="PositionTestBlue", group="linearOpMode")
public class PositionTestBlue extends AutonomousPrime2021 {
    @Override
    public void runOpMode(){
        mapObjects();
        waitForStart();

            //telemetry.addData("IMU Readout: ", getAngleOffset(90));
            //telemetry.update();
            rightEncoder(90, 0.25);
            pause(4);
            leftEncoder(90, 0.25);


        //hi logan -Jacob
    }
}