/*
 * Copyright 2016 Hochschule Luzern Informatik.
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
package ch.hslu.demo;

import nl.jqno.equalsverifier.EqualsVerifier;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

/**
 * Testfälle für Point.
 */
@SuppressWarnings("PMD.TooManyMethods")
public class PointTest {

    /**
     * Test of getX method, of class Point.
     */
    @Test
    public void testGetX() {
        assertEquals(10, new Point(10, 0).getX());
    }

    /**
     * Test of getY method, of class Point.
     */
    @Test
    public void testGetY() {
        assertEquals(20, new Point(0, 20).getY());
    }

    /**
     * Test {@link ch.hslu.demo.Point#getQuadrant()}.
     */
    @Test
    public final void testGetQuadrant1() {
        assertEquals(1, new Point(1, 1).getQuadrant());
    }

    /**
     * Test {@link ch.hslu.demo.Point#getQuadrant()}.
     */
    @Test
    public final void testGetQuadrant2() {
        assertEquals(2, new Point(-1, 1).getQuadrant());
    }

    /**
     * Test {@link ch.hslu.demo.Point#getQuadrant()}.
     */
    @Test
    public final void testGetQuadrant3() {
        assertEquals(3, new Point(-1, -1).getQuadrant());
    }

    /**
     * Test {@link ch.hslu.demo.Point#getQuadrant()}.
     */
    @Test
    public final void testGetQuadrant4() {
        assertEquals(4, new Point(1, -1).getQuadrant());
    }

    /**
     * Test {@link ch.hslu.demo.Point#getQuadrant()}.
     */
    @Test
    public final void testGetQuadrantXAchse() {
        assertThat(new Point(0, 1).getQuadrant(), equalTo(0));
    }

    /**
     * Test {@link ch.hslu.demo.Point#getQuadrant()}.
     */
    @Test
    public final void testGetQuadrantYAchse() {
        assertThat(new Point(1, 0).getQuadrant(), equalTo(0));
    }

    /**
     * Test {@link ch.hslu.demo.Point#getQuadrant()}.
     */
    @Test
    public final void testGetQuadrantNullpunkt() {
        assertThat(new Point(0, 0).getQuadrant(), equalTo(0));
    }

    /**
     * Test {@link ch.hslu.demo.Point#toString()}.
     */
    @Test
    public void testToString() {
        assertThat(new Point(3, 3).toString().length(), greaterThan(10));
    }

    /**
     * Test {@link ch.hslu.demo.Point#equals(java.lang.Object)} Contract.
     */
    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Point.class).verify();
    }

    /**
     * Test {@link ch.hslu.demo.Point#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsSame() {
        final Point point1 = new Point(1, 1);
        final Point point2 = point1;
        assertEquals(point1, point2);
    }

    /**
     * Test {@link ch.hslu.demo.Point#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsEqual() {
        final Point point1 = new Point(1, 1);
        final Point point2 = new Point(1, 1);
        assertEquals(point1, point2);
    }

    /**
     * Test {@link ch.hslu.demo.Point#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsNotEqual() {
        final Point point1 = new Point(1, 2);
        final Point point2 = new Point(2, 1);
        assertNotEquals(point1, point2);
    }

    /**
     * Check Immutability of Point.
     */
    @Test
    public void testImmutability() {
        assertImmutable(Point.class);
    }
}
