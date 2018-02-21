package ch.hslu.oop.sw11.Temperatur;

import ch.hslu.oop.sw07.Person.Person;

import java.util.Comparator;

/**
 * Comparator für die Klasse {@link Person} die zwei Personen nach Nachname und Vorname aufsteigend ordnet.
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */

public class MesspunktTemperaturComparator implements Comparator<Messpunkt> {

    /**
     * Vergleicht zwei Personen miteinander
     * {@inheritDoc}
     *
     * @param p1 die erste Person zum Vergleichen
     * @param p2 die zweite Person zum Vergleichen
     * @return Ob der Vorname und oder Nachname gleich ist
     */
    @Override
    public int compare(Messpunkt p1, Messpunkt p2) {
        int compare = p1.getTemperatur().compareTo(p2.getTemperatur());

        if (compare == 0) {
            compare = p1.getDateTime().compareTo(p2.getDateTime());
        }

        return compare;
    }
}
