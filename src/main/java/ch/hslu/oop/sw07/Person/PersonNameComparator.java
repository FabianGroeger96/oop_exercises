package ch.hslu.oop.sw07.Person;

import java.util.Comparator;

/**
 * Comparator für die Klasse {@link Person} die zwei Personen nach Nachname und Vorname aufsteigend ordnet.
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */

public class PersonNameComparator implements Comparator<Person> {

    /**
     * Vergleicht zwei Personen miteinander
     * {@inheritDoc}
     *
     * @param p1 die erste Person zum Vergleichen
     * @param p2 die zweite Person zum Vergleichen
     * @return Ob der Vorname und oder Nachname gleich ist
     */
    @Override
    public int compare(Person p1, Person p2) {
        int compare = p1.getLastName().compareTo(p2.getLastName());

        if (compare == 0) {
            compare = p1.getFirstName().compareTo(p2.getFirstName());
        }

        return compare;
    }
}
