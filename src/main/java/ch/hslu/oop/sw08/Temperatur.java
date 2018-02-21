package ch.hslu.oop.sw08;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.Objects;

/**
 * Aufgabe equals(), hashCode() und Comparable (SW07)
 *
 * @author Fabian Gröger
 * @version 7.11.2017
 */
@Immutable
public final class Temperatur implements Comparable<Temperatur> {

    /**
     * Offset für die Umrechnung in Kelvin.
     */
    public static final float KELVIN_OFFSET = 273.15f;

    // Instanzvariable
    private float tempCelsius;

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
    public Temperatur(final float temp) {
        this.tempCelsius = temp;
    }

    /**
     * Liefert die Temperatur in Celsius zurück.
     *
     * @return Temperatur in Celsius
     */
    public float getTempCelsius() {
        return this.tempCelsius;
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur in Celsius
     */
    public void setTempCelsius(final float temp) {
        this.tempCelsius = temp;
    }

    /**
     * Liefert die Temperatur in Kelvin zurück.
     *
     * @return Temperatur in Kelvin
     */
    public float getTempKelvin() {
        return convertCelsiusToKelvin(this.tempCelsius);
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur in Kelvin
     */
    public void setTempKelvin(final float temp) {
        this.tempCelsius = convertKelvinToCelsius(temp);
    }

    /**
     * Liefert die Temperatur in Fahrenheit zurück.
     *
     * @return Temperatur in Fahrenheit
     */
    public float getTempFahrenheit() {
        return this.tempCelsius * 1.8f + 32;
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur in Fahrenheit
     */
    public void setTempFahrenheit(final float temp) {
        this.tempCelsius = (temp - 32) / 1.8f;
    }

    /**
     * Konvertieren einer Temperatur in Kelvin zu Celsius
     *
     * @param kelvin die Temperatur in Kelvin
     */
    public static float convertKelvinToCelsius(final float kelvin){
        return kelvin - KELVIN_OFFSET;
    }

    /**
     * Konvertieren einer Temperatur in Celsius zu Kelvin
     *
     * @param celsius die Temperatur in Celsius
     */
    public static float convertCelsiusToKelvin(final float celsius){
        return celsius + KELVIN_OFFSET;
    }

    /**
     * Liefert eine String-Repräsentation der Temperatur.
     * {@inheritDoc}.
     */
    @Override
    final public String toString() {
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
    final public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Temperatur)) {
            return false;
        }
        final Temperatur other = (Temperatur) obj;

        return Float.compare(other.tempCelsius, this.tempCelsius) == 0;
    }

    /**
     * Liefert eine Hash-Repräsentation der Temperatur.
     * {@inheritDoc}.
     */
    @Override
    final public int hashCode() {
        return Objects.hash(this.tempCelsius);
    }

    /**
     * Vergleicht zwei Temperaturen miteinander.
     * {@inheritDoc}.
     */
    @Override
    public int compareTo(Temperatur other) {
        return Float.compare(this.tempCelsius, other.tempCelsius);
    }


}
