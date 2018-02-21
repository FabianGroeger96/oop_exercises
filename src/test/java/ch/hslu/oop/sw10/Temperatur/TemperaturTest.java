package ch.hslu.oop.sw10.Temperatur;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperaturTest {

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Temperatur.class).verify();
    }

    @Test
    public void convertKelvinToCelsius() throws Exception {
        final float tempKelvin = Temperatur.convertCelsiusToKelvin(20);
        final float tempExpected = 20 + 273.15f;

        assertEquals(tempExpected, tempKelvin,0);
    }

    @Test
    public void convertCelsiusToKelvin() throws Exception {
        final float tempCelsius = Temperatur.convertKelvinToCelsius(293.15f);
        final float tempExpected = 20;

        assertEquals(tempExpected, tempCelsius,0);
    }

}