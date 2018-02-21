package ch.hslu.oop.sw09;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class TemperaturTest {

    @Test
    public void checkEqualsContract() {
        EqualsVerifier.forClass(Temperatur.class).verify();
    }

    @Test
    public void checkImmutable() {
        assertImmutable(Temperatur.class);
    }

    @Test
    public void convertKelvinToCelsius() throws Exception {
        final float tempKelvin = Temperatur.convertCelsiusToKelvin(20);
        final float tempExpected = 20 + 273.15f;

        assertEquals(tempExpected, tempKelvin, 0);
    }

    @Test
    public void convertCelsiusToKelvin() throws Exception {
        final float tempCelsius = Temperatur.convertKelvinToCelsius(293.15f);
        final float tempExpected = 20;

        assertEquals(tempExpected, tempCelsius,0);
    }

    @Test
    public void createTemperaturCelsius(){
        Temperatur temperatur = Temperatur.createFromCelsius(-200f);
        assertEquals(-200f, temperatur.getTempCelsius(), 0);
    }

    @Test
    public void createTemperaturKelvin(){
        Temperatur temperatur = Temperatur.createFromKelvin(-200f);
        assertEquals(-473.15, temperatur.getTempCelsius(), 1);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testIllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Keinen Gültigen Temperaturwert übergeben");

        Temperatur temperatur = Temperatur.createFromCelsius(-300f);
    }

}