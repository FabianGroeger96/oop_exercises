package ch.hslu.oop.sw01;

/**
 * Beschreiben Sie hier die Klasse Fahrrad.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fahrrad {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private String owner;
    private String number;
    private String color;
    private String typ;
    private double price;
    private double herstellungsprice;
    private boolean isWorking;
    private boolean isLocked;
    private boolean hasPieces;

    /**
     * Konstruktor die Klasse Fahrrad
     *
     * @param owner  der Name des Besitzers
     * @param number die Nummer des Fahrrads
     * @param color  die Farbe des Fahrrads
     */
    public Fahrrad(String owner, String number, String color) {
        // Instanzvariable initialisieren
        this.owner = owner;
        this.number = number;
        this.color = color;

        this.isWorking = true;
        this.isLocked = true;
    }

    public Fahrrad(String number, String color, String typ, double price) {
        // Instanzvariable initialisieren
        this.owner = "Fahrradshop";
        this.number = number;
        this.color = color;
        this.typ = typ;
        this.price = price;

        this.isWorking = true;
        this.isLocked = true;
    }

    public Fahrrad(String number, String color, String typ, double price, double herstellungsprice, boolean hasPieces) {
        // Instanzvariable initialisieren
        this.owner = "Fahrradproduktion";
        this.number = number;
        this.color = color;
        this.typ = typ;
        this.price = price;
        this.herstellungsprice = herstellungsprice;
        this.hasPieces = hasPieces;

        this.isWorking = true;
        this.isLocked = true;
    }

    public void goTo(int position) {
        this.isLocked = false;

        for (int i = 0; i <= position; i++) {
            x++;
        }

        this.isLocked = true;
    }

    public boolean canSteal() {
        return this.isLocked;
    }

    public boolean canProduce() {
        if (this.hasPieces) {
            return true;
        } else {
            return false;
        }
    }
}
