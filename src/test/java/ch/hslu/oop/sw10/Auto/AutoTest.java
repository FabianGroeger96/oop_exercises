package ch.hslu.oop.sw10.Auto;

import org.junit.Test;

import static org.junit.Assert.*;

public class AutoTest {

    @Test
    public void Event() throws Exception {
        //Auto auto = new Auto("TestModel");

        //auto.switchOn();
    }

    @Test
    public void getModel() throws Exception {
        Auto auto = new Auto("TestModel");

        assertEquals("TestModel", auto.getModel());
    }

    @Test
    public void isSwitchedOn() throws Exception {
        Auto auto = new Auto("TestModel");
        auto.switchOn();

        assertTrue(auto.isSwitchedOn());
    }

    @Test
    public void isSwitchedOff() throws Exception {
        Auto auto = new Auto("TestModel");
        auto.switchOff();

        assertTrue(auto.isSwitchedOff());
    }

}