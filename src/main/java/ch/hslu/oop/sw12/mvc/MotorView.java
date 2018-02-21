package ch.hslu.oop.sw12.mvc;

import ch.hslu.oop.sw10.Auto.MotorState;

public class MotorView {
    public void printMotorDetails(boolean switchedOn){
        System.out.println("Motor: ");
        System.out.println("Motor State: " + switchedOn);
    }
}
