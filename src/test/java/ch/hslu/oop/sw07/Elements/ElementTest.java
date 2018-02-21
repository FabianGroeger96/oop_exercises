package ch.hslu.oop.sw07.Elements;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementTest {

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Element.class).verify();
    }

    @Test
    public void testEqualsSameObject() {
        final double temp = 30;

        final Element element = new Blei(temp);

        final boolean equal = element.equals(element);

        assertEquals(true, equal);
    }

    @Test
    public void testEqualsSameParameters() {
        final double temp = 30;

        final Element element1 = new Blei(temp);
        final Element element2 = new Blei(temp);

        final boolean equal = element1.equals(element2);

        assertEquals(true, equal);
    }

    @Test
    public void testEqualsDifferentElement() {
        final double temp = 30;

        final Element element1 = new Blei(temp);
        final Element element2 = new Stickstoff(temp);

        final boolean equal = element1.equals(element2);

        assertEquals(false, equal);
    }

    @Test
    public void testEqualsDifferentTemp() {
        final double tempBlei = 30;
        final double tempStickstoff = 40;

        final Element element1 = new Blei(tempBlei);
        final Element element2 = new Stickstoff(tempStickstoff);

        final boolean equal = element1.equals(element2);

        assertEquals(false, equal);
    }

    @Test
    public void testHashSame() {
        final double temp = 30;

        final Element element1 = new Blei(temp);
        final Element element2 = new Blei(temp);

        final boolean equal = element1.hashCode() == element2.hashCode();

        assertEquals(true, equal);
    }

    @Test
    public void testHashDifferentElement() {
        final double temp = 30;

        final Element element1 = new Blei(temp);
        final Element element2 = new Stickstoff(temp);

        final boolean equal = element1.hashCode() == element2.hashCode();

        assertEquals(false, equal);
    }

    @Test
    public void testHashDifferentTemp() {
        final double tempBlei = 30;
        final double tempStickstoff = 40;

        final Element element1 = new Blei(tempBlei);
        final Element element2 = new Stickstoff(tempStickstoff);

        final boolean equal = element1.hashCode() == element2.hashCode();

        assertEquals(false, equal);
    }

}