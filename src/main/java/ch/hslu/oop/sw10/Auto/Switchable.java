package ch.hslu.oop.sw10.Auto;

/**
 * Tragen Sie hier eine Beschreibung des Interface Switchable ein.
 *
 * @author Fabian Gröger
 * @version 10.10.2017
 */

public interface Switchable {
    /**
     * Schaltet etwas ein.
     */
    void switchOn();

    /**
     * Schaltet etwas aus.
     */
    void switchOff();

    /**
     * Gibt zurück ob etwas eingeschaltet ist oder nicht.
     *
     * @return ob der Schalter eingeschaltet ist.
     */
    boolean isSwitchedOn();

    /**
     * Gibt zurück ob etwas ausgeschaltet ist oder nicht.
     *
     * @return ob der Schalter ausgeschaltet ist.
     */
    boolean isSwitchedOff();
}
