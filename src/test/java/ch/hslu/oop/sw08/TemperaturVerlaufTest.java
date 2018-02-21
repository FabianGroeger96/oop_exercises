package ch.hslu.oop.sw08;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperaturVerlaufTest {

    @Test
    public void add() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));

        assertEquals(2, temperaturVerlauf.getCount());
    }

    @Test
    public void clear() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(40));

        temperaturVerlauf.clear();

        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    public void getCount() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(40));

        assertEquals(3, temperaturVerlauf.getCount());
    }

    @Test
    public void getCountZero() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    public void max() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(10));

        Temperatur max = temperaturVerlauf.max();

        assertEquals(new Temperatur(30), max);
    }

    @Test
    public void maxZero() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur max = temperaturVerlauf.max();

        assertEquals(null, max);
    }

    @Test
    public void min() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(10));

        Temperatur min = temperaturVerlauf.min();

        assertEquals(new Temperatur(10), min);
    }

    @Test
    public void minZero() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur min = temperaturVerlauf.min();

        assertEquals(null, min);
    }

    @Test
    public void durchschnitt() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(new Temperatur(20));
        temperaturVerlauf.add(new Temperatur(30));
        temperaturVerlauf.add(new Temperatur(10));

        Temperatur durchschnitt = temperaturVerlauf.durchschnitt();

        assertEquals(new Temperatur(20), durchschnitt);
    }

    @Test
    public void durchschnittZero() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur durchschnitt = temperaturVerlauf.durchschnitt();

        assertEquals(null, durchschnitt);
    }
}