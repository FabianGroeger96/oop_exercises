package ch.hslu.oop.sw12.mvc;

import ch.hslu.oop.sw10.Auto.Motor;

public class MotorApplikation {

    public static void main(String[] args) {
        Motor model  = getMotor();

        MotorView view = new MotorView();
        MotorControl controller = new MotorControl(model, view);
        controller.updateView();

        controller.switchOn();
        controller.updateView();
    }

    private static Motor getMotor(){
        Motor motor = new Motor();
        return motor;
    }
}
