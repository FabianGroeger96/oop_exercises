package ch.hslu.oop.sw11.Temperatur;

import ch.hslu.oop.sw10.Temperatur.Temperatur;

import java.time.LocalDateTime;
import java.util.Objects;

public class Messpunkt implements Comparable<Messpunkt>{

    private Temperatur temperatur;
    private LocalDateTime dateTime;

    public Messpunkt(final Temperatur temperatur, final LocalDateTime dateTime){
        this.temperatur = temperatur;
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Temperatur getTemperatur() {
        return this.temperatur;
    }

    public void setTemperatur(Temperatur temperatur) {
        this.temperatur = temperatur;
    }

    /**
     * Liefert eine String-Repräsentation des Messpunkt.
     * {@inheritDoc}.
     */
    @Override
    final public String toString() {
        return "Messpunkt[Temperatur=" + this.temperatur.toString() + ",DateTime=" + this.dateTime.toString() + "]";
    }

    /**
     * Überprüft ob Messpunkte gleich sind.
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
        if (!(obj instanceof Messpunkt)) {
            return false;
        }
        final Messpunkt other = (Messpunkt) obj;

        return Float.compare(other.temperatur.getTempCelsius(), this.temperatur.getTempCelsius()) == 0 && other.dateTime.equals(this.dateTime);
    }

    /**
     * Liefert eine Hash-Repräsentation des Messpunkt.
     * {@inheritDoc}.
     */
    @Override
    final public int hashCode() {
        return Objects.hash(this.temperatur, this.dateTime);
    }

    /**
     * Vergleicht zwei Messpunkte miteinander.
     * {@inheritDoc}.
     */
    @Override
    public int compareTo(Messpunkt other) {
        return Float.compare(this.temperatur.getTempCelsius(), other.temperatur.getTempCelsius());
    }
}
