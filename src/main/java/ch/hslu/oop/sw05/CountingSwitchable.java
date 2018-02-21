package ch.hslu.oop.sw05;

/**
 * Tragen Sie hier eine Beschreibung des Interface CountingSwitchable ein.
 * 
 * @author Fabian Gröger 
 * @version 17.10.2017
 */

public interface CountingSwitchable extends Switchable
{
    /**
     * Diese Methode gibt eine Zahl zurück wieviel mal der Schalter gebraucht wurde
     * 
     * @return   long     wieviel mal der Schalter ausgeführt wurde
     */
    long getSwitchCount();
}
