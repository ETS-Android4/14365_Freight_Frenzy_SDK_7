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
            getAngle();
            pause(4);
            zeroBotEncoder(0.15);
        }

        //hi logan -Jacob
        //What da dog doin? -Nate
    }
}