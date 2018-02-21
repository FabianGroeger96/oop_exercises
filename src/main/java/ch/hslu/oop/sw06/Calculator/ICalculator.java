package ch.hslu.oop.sw06.Calculator;

/**
 * Dieses Interface wird für einen simplen Taschenrechner gebraucht.
 *
 * @author Fabian Gröger
 * @version 24.11.2017
 */

public interface ICalculator {

    /**
     * Addiert zwei Ganzzahlen (int) miteinander
     *
     * @param a     int     Ganzzahl zum Addieren
     * @param b     int     Ganzzahl zum Addieren
     *
     * @return Addierte Ganzzahl (int)
     */

    int addition(int a, int b);

    /**
     * Subtrahiert zwei Ganzzahlen (int) miteinander
     *
     * @param a     int     Ganzzahl zum Subtrahieren
     * @param b     int     Ganzzahl zum Subtrahieren
     *
     * @return Subtrahierte Ganzzahl (int)
     */

    int subtract(int a, int b);


    /**
     * Multipliziert zwei Ganzzahlen (int) miteinander
     *
     * @param a     int     Ganzzahl zum Multiplizieren
     * @param b     int     Ganzzahl zum Multiplizieren
     *
     * @return Multiplizierte Ganzzahl (int)
     */

    int multiply(int a, int b);


    /**
     * Multipliziert zwei Ganzzahlen (int) miteinander
     *
     * @param a     int     Ganzzahl zum Multiplizieren
     * @param b     int     Ganzzahl zum Multiplizieren
     *
     * @return Multiplizierte Ganzzahl (int)
     */

    int divide(int a, int b);
}
