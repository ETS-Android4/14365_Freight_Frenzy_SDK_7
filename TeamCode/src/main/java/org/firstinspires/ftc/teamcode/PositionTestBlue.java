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
            updateRightDist();
            telemetry.addData("RightDist: ", RightDist);
            telemetry.update();
        }

        //dArm(-5,0.25);
        //pause(5);

        //chute(10,0.5);

        //hi logan -Jacob
        //What da dog doin? -Nate
        //Ur mom -Abraham Lincoln
    }
}