package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class IntakeMotorTest extends OpMode {
    public DcMotorEx intakeMotor;


    @Override
    public void init() {
       intakeMotor = hardwareMap.get(DcMotorEx.class, "intakeMotor");

       intakeMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }

    @Override
    public void loop() {
        if(gamepad1.a){
            intakeMotor.setPower(1.0);
        }
        else{
            intakeMotor.setPower(0.0);
        }

    }
}
