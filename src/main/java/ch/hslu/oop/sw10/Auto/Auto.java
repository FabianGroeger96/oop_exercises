package ch.hslu.oop.sw10.Auto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Beschreiben Sie hier die Klasse Auto.
 * 
 * @author Fabian Gröger
 * @version 21.11.2017
 */
public class Auto implements Switchable {

    private String model;
    private boolean running;
    private Motor motor;

    private static final Logger LOGGER = LogManager.getLogger(Auto.class);

    /**
     * Konstruktor für Objekte der Klasse Auto
     */
    public Auto(final String model) {
        this.model = model;

        this.motor = new Motor();
        this.motor.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                handleMotorEvent("Event vom Motor", event);
            }
        });
    }

    private void handleMotorEvent(String output, PropertyChangeEvent event) {
        LOGGER.info(output, event);
    }

    public String getModel() {
        return this.model;
    }

    public Motor getMotor() {
        return this.motor;
    }

    @Override
    public boolean isSwitchedOn() {

        if (this.running){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isSwitchedOff() {

        if (!this.running){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void switchOff() {
        this.running = false;
        this.motor.switchOff();
    }

    @Override
    public void switchOn() {
        this.running = true;
        this.motor.switchOn();
    }
}
