package ch.hslu.oop.sw08.Elemente;

/**
 * Klasse Quecksilber erweitert die Klasse {@link Element}, mit dem Spezifischen Schmelz und Siedepunkt
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */
public class Quecksilber extends Element {

    /**
     * Konstruktor für die Klasse Quecksilber
     *
     * @param temp die Temperatur des Elements
     */
    public Quecksilber(double temp) {

        super(temp, -38.83, 357);
    }
}
