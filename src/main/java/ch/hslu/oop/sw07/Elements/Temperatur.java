package ch.hslu.oop.sw07.Elements;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Objects;

/**
 * Aufgabe equals(), hashCode() und Comparable (SW07)
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */
@Immutable
public class Temperatur implements Comparable<Temperatur> {

    /**
     * Offset für die Umrechnung in Kelvin.
     */
    public static final double KELVIN_OFFSET = 273.15;

    // Instanzvariable
    private double tempCelsius;

    /**
     * Konstruktor für die Klasse Temperatur
     */
    public Temperatur() {
        // Instanzvariable initialisieren
        this.tempCelsius = 20;
    }

    /**
     * Konstruktor für die Klasse Temperatur
     *
     * @param temp die Temperatur in Celsius
     */
    public Temperatur(double temp) {
        this.tempCelsius = temp;
    }

    /**
     * Liefert die Temperatur in Celsius zurück.
     *
     * @return Temperatur in Celsius
     */
    public double getTempCelsius() {
        return this.tempCelsius;
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur in Celsius
     */
    public void setTempCelsius(double temp) {
        this.tempCelsius = temp;
    }

    /**
     * Liefert die Temperatur in Kelvin zurück.
     *
     * @return Temperatur in Kelvin
     */
    public double getTempKelvin() {
        return this.tempCelsius + KELVIN_OFFSET;
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur in Kelvin
     */
    public void setTempKelvin(double temp) {
        this.tempCelsius = temp - KELVIN_OFFSET;
    }

    /**
     * Liefert die Temperatur in Fahrenheit zurück.
     *
     * @return Temperatur in Fahrenheit
     */
    public double getTempFahrenheit() {
        return this.tempCelsius * 1.8 + 32;
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur in Fahrenheit
     */
    public void setTempFahrenheit(double temp) {
        this.tempCelsius = (temp - 32) / 1.8;
    }

    /**
     * Liefert eine String-Repräsentation der Temperatur.
     * {@inheritDoc}.
     */
    @Override
    public final String toString() {
        return "Temperatur[tempCelsius=" + this.tempCelsius + "]";
    }

    /**
     * Überprüft ob Temperaturen gleich sind.
     * 1. Identität gleich
     * 2. Korrekter Typ
     * 3. Werte gleich
     * {@inheritDoc}.
     */
    @Override
    public final boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Temperatur)) {
            return false;
        }
        final Temperatur other = (Temperatur) obj;

        return Double.compare(other.tempCelsius, this.tempCelsius) == 0;
    }

    /**
     * Liefert eine Hash-Repräsentation der Temperatur.
     * {@inheritDoc}.
     */
    @Override
    public final int hashCode() {
        return Objects.hash(this.tempCelsius);
    }

    /**
     * Vergleicht zwei Temperaturen miteinander.
     * {@inheritDoc}.
     */
    @Override
    public int compareTo(Temperatur other) {
        return Double.compare(this.tempCelsius, other.tempCelsius);
    }


}
