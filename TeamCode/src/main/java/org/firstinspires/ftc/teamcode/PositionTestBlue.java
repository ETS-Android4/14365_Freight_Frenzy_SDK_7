package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// TODO: General test program, update with whatever tasks as necessary

@Autonomous(name="PositionTestBlue", group="linearOpMode")
public class PositionTestBlue extends AutonomousPrime2021 {
    @Override
    public void runOpMode(){
        mapObjects();
        waitForStart();

        leftEncoder(90, 0.15);

        pause(4);

        rightEncoder(90, 0.15);

        //hi logan -Jacob
        //What da dog doin? -Nate
    }
}