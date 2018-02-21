package ch.hslu.oop.sw07.Person;

import ch.hslu.oop.sw07.Person.Person;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void PersonParameterNormal() throws Exception {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person = new Person(id, lastname, firstname, age);

        assertEquals(id, person.getID());
        assertEquals(lastname, person.getLastName());
        assertEquals(firstname, person.getFirstName());
        assertEquals(age, person.getAge());
    }

    @Test
    public void PersonParameterNull() throws Exception {
        final long id = 0;
        final String lastname = null;
        final String firstname = null;
        final int age = 0;

        final Person person = new Person(id, lastname, firstname, age);

        assertEquals(id, person.getID());
        assertEquals(lastname, person.getLastName());
        assertEquals(firstname, person.getFirstName());
        assertEquals(age, person.getAge());
    }

    @Test
    public void testEqualsContract() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    public void testEqualsSameObject() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);

        final boolean equal = person1.equals(person1);

        assertTrue(equal);
    }

    @Test
    public void testEqualsSameParameters() {
        final long id = 1;
        final String lastname = null;
        final String firstname = "Max";
        final int age = 1;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(id, lastname, firstname, age);

        final boolean equal = person1.equals(person2);

        assertTrue(equal);
    }

    @Test
    public void testEqualsDifferent() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(3828, "Test", "Tester", 16);

        final boolean equal = person1.equals(person2);

        assertFalse(equal);
    }

    @Test
    public void testHashSame() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(id, lastname, firstname, age);

        final boolean equal = person1.hashCode() == person2.hashCode();

        assertTrue(equal);
    }

    @Test
    public void testHashDifferent() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(3828, "Test", "Tester", 16);

        final boolean equal = person1.hashCode() == person2.hashCode();

        assertFalse(equal);
    }

    @Test
    public void testCompareToSame() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(id, lastname, firstname, age);

        final int equalInt = person1.compareTo(person2);

        assertEquals(0, equalInt);
    }

    @Test
    public void testCompareToHigher() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(id + 100, lastname, firstname, age);

        final int equalInt = person1.compareTo(person2);

        assertEquals(-1, equalInt);
    }

    @Test
    public void testCompareToLower() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(id - 100, lastname, firstname, age);

        final int equalInt = person1.compareTo(person2);

        assertEquals(1, equalInt);
    }

    @Test
    public void testCompareToNull() {
        final long id = 5837;
        final String lastname = "Mustermann";
        final String firstname = "Max";
        final int age = 27;

        final Person person1 = new Person(id, lastname, firstname, age);
        final Person person2 = new Person(0, lastname, firstname, age);

        final int equalInt = person1.compareTo(person2);

        assertEquals(1, equalInt);
    }

}