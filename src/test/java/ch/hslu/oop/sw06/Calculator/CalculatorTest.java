package ch.hslu.oop.sw06.Calculator;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void additionNormal() throws Exception {
        assertEquals(8, new Calculator().addition(3,5));
    }

    @Test
    public void additionNegative() throws Exception {
        assertEquals(-8, new Calculator().addition(-3,-5));
    }

    @Test
    public void additionZero() throws Exception {
        assertEquals(0, new Calculator().addition(0,0));
    }

    @Test
    public void additionMax() throws Exception {
        assertEquals(Integer.MIN_VALUE, new Calculator().addition(Integer.MAX_VALUE,1));
    }

    @Test
    public void subtractNormal() throws Exception {
        assertEquals(2, new Calculator().subtract(5,3));
    }

    @Test
    public void subtractNegative() throws Exception {
        assertEquals(2, new Calculator().subtract(-3,-5));
    }

    @Test
    public void subtractZero() throws Exception {
        assertEquals(0, new Calculator().subtract(0,0));
    }

    @Test
    public void subtractMax() throws Exception {
        assertEquals(Integer.MAX_VALUE - 1, new Calculator().subtract(Integer.MAX_VALUE,1));
    }
}