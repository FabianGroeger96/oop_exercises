package ch.hslu.oop.sw07.Elements;

import ch.hslu.oop.sw07.Person.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class TemperaturTest {

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Temperatur.class).verify();
    }

}