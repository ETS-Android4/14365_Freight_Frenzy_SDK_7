package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.SwitchableLight;

// TODO: General test program, update with whatever tasks as necessary

@Autonomous(name="Blue_Carousel_Storage", group="linearOpMode")
public class B_C_S extends AutonomousPrime2020 {
    @Override
    public void runOpMode(){
        mapObjects();
        waitForStart();

        boolean CarouselSpun = false;

        strafeRightEncoder(50, 0.75);
        pause(0.25);
        wobbleRelease();
        CarouselSpun = true;
        telemetry.addData("Carousal Spun: ", CarouselSpun);
        telemetry.update();
        pause(1.5);
        forwardEncoder(40, 1);
        pause(0.25);
        leftEncoder(90,1);
        forwardEncoder(100,1);
        pause(0.25);
        wobbleLock();
        zeroBotEncoder(0.5);
        strafeRightEncoder(100,1);



        //hi logan -Jacob
    }
}