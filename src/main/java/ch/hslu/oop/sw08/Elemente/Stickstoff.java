package ch.hslu.oop.sw08.Elemente;

/**
 * Klasse Stickstoff erweitert die Klasse {@link Element}, mit dem Spezifischen Schmelz und Siedepunkt
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */
public class Stickstoff extends Element {

    /**
     * Konstruktor für die Klasse Stickstoff
     *
     * @param temp die Temperatur des Elements
     */
    public Stickstoff(double temp) {

        super(temp, -210.1, -196);
    }
}
