package ch.hslu.oop.sw07.Elements;

import java.util.Objects;

/**
 * Klasse Element die eine {@link Temperatur}, einen spezifischen Schmelzpunkt und Siedepunkt hat.
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */
public abstract class Element implements Comparable<Element> {

    final private Temperatur temp;
    final private double schmelzpunkt;
    final private double siedepunkt;

    /**
     * Konstruktor für die Klasse Element
     *
     * @param temp  die Temperatur in Celsius des Elements
     * @param schmelzpunkt  der Schmelzpunkt des Elements
     * @param siedepunkt der Siedepunkt des Elements
     */
    public Element(double temp, double schmelzpunkt, double siedepunkt) {
        this.temp = new Temperatur(temp);
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    /**
     * Konstruktor für die Klasse Element
     *
     * @param temp  die Temperatur des Elements
     * @param schmelzpunkt  der Schmelzpunkt des Elements
     * @param siedepunkt der Siedepunkt des Elements
     */
    public Element(Temperatur temp, double schmelzpunkt, double siedepunkt) {
        this(temp.getTempCelsius(), schmelzpunkt, siedepunkt);
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur in Celsius
     */
    public void setTemp(double temp) {
        this.temp.setTempCelsius(temp);
    }

    /**
     * Setzen einer neuen Temperatur
     *
     * @param temp die neue Temperatur
     */
    public void setTemp(Temperatur temp) {
        setTemp(temp.getTempCelsius());
    }

    /**
     * Liefert die Temperatur des Elements zurück.
     *
     * @return Temperatur in Celsius des Elements
     */
    public double getTemp() {
        if (this.temp != null) {
            return this.temp.getTempCelsius();
        } else {
            return 0;
        }
    }

    /**
     * Gibt den Aggregats Zustand durch die Instanzvariablen Schmelz- und Siedepunkt zurück.
     *
     * @return den Aggregats Zustand.
     */
    private String getAggregatsZu() {
        if (this.temp.getTempCelsius() <= this.schmelzpunkt) {
            return "fest";
        } else if (this.temp.getTempCelsius() >= this.siedepunkt) {
            return "gasförmig";
        } else {
            return "flüssig";
        }
    }

    /**
     * Liefert eine String-Repräsentation des Elements.
     * {@inheritDoc}.
     */
    @Override
    public final String toString() {
        return "Element[Temperatur=" + this.temp.toString() + ",Schmelzpunkt=" + this.schmelzpunkt + ",Siedepunkt=" + this.siedepunkt + "]";
    }

    /**
     * Überprüft ob Elemente gleich sind.
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
        if (!(obj instanceof Element)) {
            return false;
        }

        final Element other = (Element) obj;

        return (other.temp == this.temp || (other.temp != null && other.temp.equals(this.temp))) && Double.compare(other.schmelzpunkt, this.schmelzpunkt) == 0 && Double.compare(other.siedepunkt, this.siedepunkt) == 0;
    }

    /**
     * Liefert eine Hash-Repräsentation des Elements.
     * {@inheritDoc}.
     */
    @Override
    public final int hashCode() {
        return Objects.hash(this.temp, this.schmelzpunkt, this.siedepunkt);
    }

    /**
     * Vergleicht zwei Personen miteinander, überprüft ob die ID gleich ist.
     * {@inheritDoc}.
     */
    @Override
    public int compareTo(Element other) {
        return this.temp.compareTo(other.temp);
    }
}
