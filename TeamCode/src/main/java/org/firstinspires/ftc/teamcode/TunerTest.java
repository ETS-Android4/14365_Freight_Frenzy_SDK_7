package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;

import net.frogbots.ftcopmodetunercommon.opmode.TunableLinearOpMode;

// TODO: General test program, update with whatever tasks as necessary



@Autonomous(name="TunerTest", group="linearOpMode")
public class TunerTest extends TunableLinearOpMode {

    /*
     ********************
     *   SETUP SERVOS   *
     ********************
     */
    //protected Servo intakeDrop;


    @Override
    public void runOpMode(){

        /*
         *****************
         *   MAP SERVOS  *
         *****************
         */
        //intakeDrop = hardwareMap.get(Servo.class, "intakeDrop");

        waitForStart();

        while(!isStopRequested()){
            telemetry.addData("test", getInt("Position"));
            telemetry.update();
        }





        //hi logan -Jacob
        //What da dog doin? -Nate
    }

    /*public void dropIntake(double position){
        intakeDrop.setPosition(position);
    }*/
}