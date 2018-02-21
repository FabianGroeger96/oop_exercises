package ch.hslu.oop.sw08.Elemente;

/**
 * Klasse Blei erweitert die Klasse {@link Element}, mit dem Spezifischen Schmelz und Siedepunkt
 *
 * @author Fabian Gröger
 * @version 31.10.2017
 */
public class Blei extends Element {

    /**
     * Konstruktor für die Klasse Blei
     *
     * @param temp die Temperatur des Elements
     */
    public Blei(double temp) {

        super(temp, 327.43, 1744);
    }
}
