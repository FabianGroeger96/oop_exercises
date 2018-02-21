package ch.hslu.oop.sw07.Point;

import ch.hslu.oop.sw07.Person.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class PointTest {

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Person.class).verify();
    }

}