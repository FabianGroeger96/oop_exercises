package ch.hslu.oop.sw10.Auto;

import org.junit.Test;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import static org.junit.Assert.*;

public class MotorTest {

    @Test
    public void getRpmZero() throws Exception {
        Motor motor = new Motor();

        assertEquals(0, motor.getRpm());
    }

    @Test
    public void getRpm() throws Exception {
        Motor motor = new Motor();
        motor.switchOn();

        assertEquals(100, motor.getRpm());
    }

    @Test
    public void isSwitchedOn() throws Exception {
        Motor motor = new Motor();
        motor.switchOn();

        assertTrue(motor.isSwitchedOn());
    }

    @Test
    public void isSwitchedOff() throws Exception {
        Motor motor = new Motor();
        motor.switchOff();

        assertTrue(motor.isSwitchedOff());
    }

    @Test
    public void EventSwitchOn() throws Exception {
        Motor motor = new Motor();
        motor.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                assertEquals(MotorState.ON, evt.getNewValue());
            }
        });

        motor.switchOn();
    }

    @Test
    public void EventSwitchOff() throws Exception {
        Motor motor = new Motor();
        motor.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                assertEquals(MotorState.OFF, evt.getNewValue());
            }
        });

        motor.switchOff();
    }

}