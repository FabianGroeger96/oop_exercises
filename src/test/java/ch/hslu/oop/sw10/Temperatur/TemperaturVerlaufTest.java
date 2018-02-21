package ch.hslu.oop.sw10.Temperatur;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperaturVerlaufTest {

    @Test
    public void add() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(Temperatur.createFromCelsius(20));
        temperaturVerlauf.add(Temperatur.createFromCelsius(30));

        assertEquals(2, temperaturVerlauf.getCount());
    }

    @Test
    public void clear() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(Temperatur.createFromCelsius(20));
        temperaturVerlauf.add(Temperatur.createFromCelsius(30));
        temperaturVerlauf.add(Temperatur.createFromCelsius(40));

        temperaturVerlauf.clear();

        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    public void getCount() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        temperaturVerlauf.add(Temperatur.createFromCelsius(20));
        temperaturVerlauf.add(Temperatur.createFromCelsius(30));
        temperaturVerlauf.add(Temperatur.createFromCelsius(40));

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

        temperaturVerlauf.add(Temperatur.createFromCelsius(20));
        temperaturVerlauf.add(Temperatur.createFromCelsius(30));
        temperaturVerlauf.add(Temperatur.createFromCelsius(10));

        Temperatur max = temperaturVerlauf.max();

        assertEquals(Temperatur.createFromCelsius(30), max);
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

        temperaturVerlauf.add(Temperatur.createFromCelsius(20));
        temperaturVerlauf.add(Temperatur.createFromCelsius(30));
        temperaturVerlauf.add(Temperatur.createFromCelsius(10));

        Temperatur min = temperaturVerlauf.min();

        assertEquals(Temperatur.createFromCelsius(10), min);
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

        temperaturVerlauf.add(Temperatur.createFromCelsius(20));
        temperaturVerlauf.add(Temperatur.createFromCelsius(30));
        temperaturVerlauf.add(Temperatur.createFromCelsius(10));

        Temperatur durchschnitt = temperaturVerlauf.durchschnitt();

        assertEquals(Temperatur.createFromCelsius(20), durchschnitt);
    }

    @Test
    public void durchschnittZero() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        Temperatur durchschnitt = temperaturVerlauf.durchschnitt();

        assertEquals(null, durchschnitt);
    }

    @Test
    public void EventMin() throws Exception {
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.addTemperaturEventListener(new TemperaturEventListener() {
            @Override
            public void temperaturEvent(TemperaturEvent temperaturEvent) {
                assertEquals(TemperaturState.MIN, temperaturEvent.getTemperaturState());
            }
        });

        temperaturVerlauf.add(Temperatur.createFromCelsius(20));
    }

}