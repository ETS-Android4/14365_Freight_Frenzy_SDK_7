package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

// TODO: General test program, update with whatever tasks as necessary

@Autonomous(name="PositionTestBlue", group="linearOpMode")
public class PositionTestBlue extends AutonomousPrime2021 {
    @Override
    public void runOpMode(){
        mapObjects();
        waitForStart();

        /*while(!isStopRequested()) {
            updateAllDist();
            telemetry.addData("RightDist: ", RightDist);
            telemetry.addData("LeftDist: ", LeftDist);

            telemetry.addData("FrontRightDist: ", FrontRightDist);
            telemetry.addData("FrontLeftDist: ", FrontLeftDist);

            telemetry.addData("BackRightDist: ", BackRightDist);
            telemetry.addData("BackLeftDist: ", BackLeftDist);

            telemetry.addData("GroundFrontDist: ", GroundFrontDist);
            telemetry.addData("GroundBackDist: ", GroundBackDist);

            telemetry.update();



        }*/

        for(int i = 0; i<=10; i++){
            dropIntake(i/10);
            pause(4);
        }



        /*while(!isStopRequested()) {
            //program to test getAngle, and then test if it properly sets the angle with setAngle()
            getAngle();
            pause(2);
            rightEncoder(20, 0.5);
            getAngle();
            pause(2);
            rightEncoder(20, 0.5);
            getAngle();
            pause(2);
            setAngle(100);
            pause(2);
            rightEncoder(20, 0.5);
            getAngle();
            pause(2);
        }*/

        //rightEncoder(135, 0.5);

        //dArm(-5,0.25);
        //pause(5);

        //chute(10,0.5);

        //hi logan -Jacob
        //What da dog doin? -Nate
        //Ur mom -Abraham Lincoln
    }
}