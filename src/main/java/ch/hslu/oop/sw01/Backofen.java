package ch.hslu.oop.sw01;

/**
 * Beschreiben Sie hier die Klasse Backofen.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Backofen {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private boolean isHeating;
    private boolean isFull;
    private int celsius;
    private String typ;
    private int anzSchienen;

    /**
     * Konstruktor für die Klasse Backofen
     *
     * @param typ der Typ des Backofens.
     */
    public Backofen(String typ) {
        // Instanzvariable initialisieren
        x = 0;
        this.isHeating = false;
        this.isFull = false;
        this.celsius = 0;
        this.typ = typ;
    }

    public boolean heat(int y) {
        for (int i = celsius; i <= y; i++) {
            celsius = i;
        }

        return true;
    }
}
