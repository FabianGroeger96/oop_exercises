package ch.hslu.oop.sw12.mvc;

import ch.hslu.oop.sw10.Auto.Motor;

public class MotorControl {
    private Motor motor;
    private MotorView motorView;

    public MotorControl(Motor motor, MotorView motorView){
        this.motor = motor;
        this.motorView = motorView;
    }

    public void switchOn(){
        motor.switchOn();
    }

    public boolean isSwitchedOn(){
        return motor.isSwitchedOn();
    }

    public void switchOff(){
        motor.switchOff();
    }

    public boolean isSwitchedOff(){
        return motor.isSwitchedOff();
    }

    public void updateView(){
        motorView.printMotorDetails(motor.isSwitchedOn());
    }
}
