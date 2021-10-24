package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
@Autonomous(name="BlueStorage", group="linearOpMode")
public class BlueStorage extends AutonomousPrime2021 {
    @Override
    public void runOpMode() {
        mapObjects();
        waitForStart();

        //Pos 1 is closest to the shipping hub, 2 is in the middle, and 3 is furthest from the shipping hub
        int cappingElemPos = 0;

        //Scan barcode
        strafeRightEncoder(55, 0.5);
        //Spin duck
        forwardEncoder(46, 0.5);
        leftEncoder(90, 0.5);

        if(cappingElemPos == 1) {
            forwardEncoder(64, 0.5);
            //pick up capping elem
            forwardEncoder(170, 0.5);
        } else if(cappingElemPos == 2) {
            forwardEncoder(41, 0.5);
            //pick up capping elem
            forwardEncoder(200, 0.5);
        } else if(cappingElemPos == 3){
            //pick up capping elem, should already be right there
            forwardEncoder(210, 0.5);
        }
            //call function that aligns the robot in the box

            strafeLeftEncoder(50, 0.5);
            forwardEncoder(50, 0.5);
            //pick up duck
        rightEncoder(180, 0.5);
        forwardEncoder(130, 0.5);
        forwardEncoder(25, 0.5);
        //drop off duck
        leftEncoder(90, 0.5);
        //Park, probably won't have time to get another duck
        forwardEncoder(160, 0.5);
    }
}