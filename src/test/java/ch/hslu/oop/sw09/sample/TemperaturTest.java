/*
 * Copyright 2017 Hochschule Luzern Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.oop.sw09.sample;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

/**
 * Tests for {@link ch.hslu.oop.sw09.sample.Temperatur}.
 */
@SuppressWarnings({ "PMD.TooManyMethods", "PMD.TooManyStaticImports" })
public final class TemperaturTest {

    private static final float PRECISION = 0.005f;

    /**
     * Exception-Rule.
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#createFromCelsius(float)}.
     */
    @Test
    public void testCreateFromCelsiusValid() {
        final Temperatur instance = Temperatur.createFromCelsius(0.0f);
        assertEquals(0.0f, instance.getCelsius(), PRECISION);
        assertEquals(273.15f, instance.getKelvin(), PRECISION);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#createFromCelsius(float)}.
     */
    @Test
    public void testCreateFromCelsiusInvalid() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Ungültiger Wert für Temperatur");
        Temperatur.createFromCelsius(-273.16f);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#createFromKelvin(float)}.
     */
    @Test
    public void testCreateFromKelvinValid() {
        final Temperatur instance = Temperatur.createFromKelvin(0.0f);
        assertEquals(0.0f, instance.getKelvin(), PRECISION);
        assertEquals(-273.15f, instance.getCelsius(), PRECISION);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#createFromKelvin(float)}.
     */
    @Test
    public void testCreateFromKelvinInvalidJUnit4Style() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Ungültiger Wert für Temperatur");
        Temperatur.createFromKelvin(-0.001f);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#createFromKelvin(float)}.
     */
    @Test
    public void testCreateFromKelvinInvalidAssertJStyle() {
        assertThatThrownBy(() -> {
            Temperatur.createFromKelvin(-0.001f);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageStartingWith("Ungültiger Wert für Temperatur");
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#Temperatur(Temperatur)}.
     */
    @Test
    public void testCopyConstruktorValid() {
        final Temperatur tempOrig = Temperatur.createFromCelsius(20.0f);
        final Temperatur tempCopy = new Temperatur(tempOrig);
        assertEquals(tempCopy, tempOrig);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#Temperatur(Temperatur)}.
     */
    @SuppressWarnings("unused")
    @Test
    public void testCopyConstruktorNull() {
        thrown.expect(NullPointerException.class);
        new Temperatur(null);
    }

    /**
     * Test method for Equals-Contract.
     */
    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Temperatur.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    /**
     * Test method for Immutablity.
     */
    @Test
    public void testCheckIsImmutable() {
        assertImmutable(Temperatur.class);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#equals(Object)}.
     */
    @Test
    public void testEqualsSame() {
        final Temperatur temperatur = Temperatur.createFromCelsius(0.0f);
        assertSame(temperatur, temperatur);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#equals(Object)}.
     */
    @Test
    public void testEqualsEqual() {
        final Temperatur temp1 = Temperatur.createFromCelsius(1.0f);
        final Temperatur temp2 = Temperatur.createFromCelsius(1.0f);
        assertEquals(temp1, temp2);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#equals(Object)}.
     */
    @Test
    public void testEqualsNotEquals() {
        final Temperatur temp1 = Temperatur.createFromCelsius(3.0f);
        final Temperatur temp2 = Temperatur.createFromCelsius(4.0f);
        assertNotEquals(temp1, temp2);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#compareTo(Temperatur)}.
     */
    @Test
    public void testCompareDifferent() {
        final Temperatur temp1 = Temperatur.createFromCelsius(10.0f);
        final Temperatur temp2 = Temperatur.createFromCelsius(20.0f);
        assertEquals(-1, temp1.compareTo(temp2));
        assertEquals(+1, temp2.compareTo(temp1));
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#compareTo(Temperatur)}.
     */
    @Test
    public void testCompareEqual() {
        final Temperatur temp1 = Temperatur.createFromCelsius(15.0f);
        final Temperatur temp2 = Temperatur.createFromCelsius(15.0f);
        assertEquals(0, temp1.compareTo(temp2));
        assertEquals(0, temp2.compareTo(temp1));
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#convertKelvinToCelsius(float)}.
     */
    @Test
    public void testConvertKelvinToCelsius() {
        assertEquals(-272.15f, Temperatur.convertKelvinToCelsius(1.0f), 0.001f);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#convertCelsiusToKelvin(float)}.
     */
    @Test
    public void testConvertKelvinToCelsiusInvalid() {
        thrown.expect(IllegalArgumentException.class);
        Temperatur.convertKelvinToCelsius(-1.0f);
    }

    /**
     * Test method for {@link ch.hslu.oop.sw09.sample.Temperatur#toString()}.
     */
    @Test
    public void testToString() {
        assertTrue(Temperatur.createFromCelsius(20.0f).toString().lastIndexOf("20.0") > 0);
    }
}
