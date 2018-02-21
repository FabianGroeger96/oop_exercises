package ch.hslu.oop.sw07.Person;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Objects;

/**
 * Klasse Person die eine eindeutige Identifikationsnummer, einen Vor- und Nachnamen und ein Alter hat.
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */
@Immutable
public class Person implements Comparable<Person> {

    final private long ID;
    private String LastName;
    private String FirstName;
    private int age;

    /**
     * Konstruktor für die Klasse Person
     *
     * @param idNumber  die ID der Person
     * @param LastName  der Nachname der Person
     * @param FirstName der Vorname der Person
     * @param age       das Alter der Person
     */
    public Person(long idNumber, String LastName, String FirstName, int age) {
        this.ID = idNumber;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.age = age;
    }

    /**
     * Liefert die ID der Person zurück.
     *
     * @return ID der Person
     */
    public long getID() {
        return this.ID;
    }

    /**
     * Setzen eines neuen Nachnamen
     *
     * @param lastName der neue Nachname
     */
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    /**
     * Liefert den Nachnamen der Person zurück.
     *
     * @return Nachname der Person
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Setzen eines neuen Vornamen
     *
     * @param firstName der neue Vorname
     */
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    /**
     * Liefert den Vornamen der Person zurück.
     *
     * @return Vorname der Person
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Setzen eines neuen Alters
     *
     * @param age das neue Alter
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Liefert das Alter der Person zurück.
     *
     * @return Alter der Person
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Liefert eine String-Repräsentation der Person.
     * {@inheritDoc}
     */
    @Override
    public final String toString() {
        return "Person[ID=" + this.ID + ",LastName=" + this.LastName + ",FirstName=" + this.FirstName + ",Age=" + this.age + "]";
    }

    /**
     * Überprüft ob Personen gleich sind.
     * 1. Identität gleich
     * 2. Korrekter Typ
     * 3. Werte gleich
     * {@inheritDoc}
     */
    @Override
    public final boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        final Person other = (Person) obj;

        return (other.ID == this.ID) && (other.LastName == this.LastName || (other.LastName != null && other.LastName.equals(this.LastName))) && (other.FirstName == this.FirstName || (other.FirstName != null && other.FirstName.equals(this.FirstName))) && (other.age == this.age);
    }

    /**
     * Liefert eine Hash-Repräsentation der Person.
     * {@inheritDoc}
     */
    @Override
    public final int hashCode() {
        return Objects.hash(this.ID, this.LastName, this.FirstName, this.age);
    }

    /**
     * Vergleicht zwei Personen miteinander.
     * {@inheritDoc}
     */
    @Override
    public int compareTo(Person other) {
        return Long.compare(this.ID, other.ID);
    }
}
