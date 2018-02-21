package ch.hslu.oop.sw07.Point;

import java.util.Objects;

/**
 * Aufgabe equals(), hashCode() und Comparable (SW07)
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */
public class Point {

    /**
     * Punkt keinem Quadrant zugeordnet.
     */
    private static final int NO_QUADRANT = 0;

    /**
     * Quadrant 1. Positiv x, Positiv y.
     */
    private static final int QUADRANT_1 = 1;

    /**
     * Quadrant 1. Negativ x, Positiv y.
     */
    private static final int QUADRANT_2 = 2;

    /**
     * Quadrant 1. Negativ x, Negativ y.
     */
    private static final int QUADRANT_3 = 3;

    /**
     * Quadrant 4. Positiv x, Negativ y.
     */
    private static final int QUADRANT_4 = 4;

    // Instanzvariablen
    private int x;
    private int y;

    /**
     * Konstruktor für die Klasse Point
     */
    public Point() {
        // Instanzvariable initialisieren
        this.x = 0;
        this.y = 0;
    }

    /**
     * Konstruktor für die Klasse Point
     *
     * @param x die Koordinate an der X-Achse
     * @param y die Koordinate an der Y-Achse
     */
    public Point(int x, int y) {
        // Instanzvariable initialisieren
        this.x = x;
        this.y = y;
    }

    /**
     * Konstruktor für die Klasse Point
     *
     * @param point der Punkt der zugewisen werden soll
     */
    public Point(Point point) {
        this(point.getX(), point.getY());
    }

    /**
     * Setzt den Punkt auf neue X-, Y-Koordinaten
     *
     * @param x die neue Koordinate an der X-Achse
     * @param y die neue Koordinate an der Y-Achse
     */
    public void setCoordinates(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Liefert die X-Koordinate des Punktes zurück.
     *
     * @return X-Koordinate des Punktes
     */
    public int getX() {

        return this.x;
    }

    /**
     * Setzen einer neuen X-Koordinate
     *
     * @param x die neue X-Koordinate
     */
    public void setX(final int x) {

        this.x = x;
    }

    /**
     * Liefert die Y-Koordinate des Punktes zurück.
     *
     * @return Y-Koordinate des Punktes
     */
    public int getY() {

        return this.y;
    }

    /**
     * Setzen einer neuen Y-Koordinate
     *
     * @param y die neue Y-Koordinate
     */
    public void setY(final int y) {

        this.y = y;
    }

    /**
     * Liefert den Quadranten in welchem der Punkt liegt.
     * Liegen die Koordinaten auf den Achsen oder
     * auf dem Nullpunkt, liefert die Funktion den Wert 0 zurück.
     *
     * @return Nummer des Quadranten.
     */
    public int getQuadrant() {
        int quadrant = NO_QUADRANT;
        if (this.x != 0 && this.y != 0) {
            if (this.x > 0) {
                if (this.y > 0) {
                    quadrant = QUADRANT_1;
                } else {
                    quadrant = QUADRANT_4;
                }
            } else {
                if (this.y > 0) {
                    quadrant = QUADRANT_2;
                } else {
                    quadrant = QUADRANT_3;
                }
            }
        }
        return quadrant;
    }

    /**
     * Verschiebt den Punkt um X-, Y-Koordinaten
     *
     * @param x die Verschiebung der Koordinate an der X-Achse
     * @param y die Verschiebung der Koordinate an der Y-Achse
     */
    public void moveRelative(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    /**
     * Verschiebt den Punkt um den neuen Punkt
     *
     * @param point die Verschiebung des Punktes um den neuen Punkt
     */
    public void moveRelative(Point point) {
        moveRelative(point.getX(), point.getY());
    }

    /**
     * Liefert eine String-Repräsentation des Punktes.
     * {@inheritDoc}.
     */
    @Override
    public final String toString() {
        return "Point[x=" + this.x + ",y=" + this.y + "]";
    }

    /**
     * Zwei Punkte mit identischen Koordinaten sind gleich.
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
        if (!(obj instanceof Point)) {
            return false;
        }
        final Point other = (Point) obj;

        return (other.x == this.x) && (other.y == this.y);
    }

    /**
     * Liefert eine Hash-Repräsentation des Punktes.
     * {@inheritDoc}.
     */
    @Override
    public final int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}
