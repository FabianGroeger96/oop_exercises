package ch.hslu.oop.sw01;

/**
 * Beschreiben Sie hier die Klasse Produkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private double anz;
    private double preis;
    private double gesamtpreis;
    private String name;

    public Produkt(double anz, double preis, String name) {
        // Instanzvariable initialisieren
        this.anz = anz;
        this.preis = preis;
        this.name = name;
        
        this.gesamtpreis = preis * anz;
    }
    
    public void print()
    {
        System.out.println(name + "  " + anz + " x " + preis + "  " + gesamtpreis);
    }
}
