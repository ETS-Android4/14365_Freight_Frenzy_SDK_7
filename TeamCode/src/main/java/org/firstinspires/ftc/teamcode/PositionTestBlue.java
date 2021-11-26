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
            updateAllDist();
            telemetry.addData("GroundFront: ", GroundFrontDist);
            telemetry.addData("GroundBack: ", GroundBackDist);
            telemetry.addData("FrontLeft: ", FrontLeftDist);
            telemetry.addData("FrontRight: ", FrontRightDist);
            telemetry.addData("BackLeft: ", BackLeftDist);
            telemetry.addData("BackRight: ", BackRightDist);
            telemetry.addData("Left: ", LeftDist);
            telemetry.addData("Right: ", RightDist);
            telemetry.update();
        }

        //hi logan -Jacob
        //What da dog doin? -Nate
    }
}