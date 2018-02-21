package ch.hslu.oop.sw06.UnitTesting;

import ch.hslu.oop.sw06.UnitTesting.Demo;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void maxNormal() throws Exception {
        assertEquals(5, new Demo().max(3,5));
    }

    @Test
    public void maxEquals() throws Exception {
        assertEquals(5, new Demo().max(5,5));
    }

    @Test
    public void maxNegative() throws Exception {
        assertEquals(-3, new Demo().max(-5,-3));
    }



}