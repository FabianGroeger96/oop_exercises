package ch.hslu.oop.sw04;

/**
 * Beschreiben Sie hier die Klasse Auto.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fahrzeug implements Switchable{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Auto
     */
    public Fahrzeug() {
        x = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return false;
    }

    @Override
    public boolean isSwitchedOff() {
        return false;
    }

    @Override
    public void switchOff() {
        //switch off
    }

    @Override
    public void switchOn() {
        //switch on
    }
}
