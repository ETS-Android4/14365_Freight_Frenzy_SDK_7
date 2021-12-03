package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// TODO: General test program, update with whatever tasks as necessary

@Autonomous(name="PositionTestBlue", group="linearOpMode")
public class PositionTestBlue extends AutonomousPrime2021 {
    @Override
    public void runOpMode(){
        mapObjects();
        waitForStart();

        while(!isStopRequested()) {
            updateBackRightDist();
            updateLeftDist();
            telemetry.addData("BackRightDist: ", BackRightDist);
            telemetry.addData("LeftDist: ", LeftDist);
            telemetry.update();
        }

        chute(10,0.5);

        //hi logan -Jacob
        //What da dog doin? -Nate
    }
}