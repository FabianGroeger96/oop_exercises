package ch.hslu.oop.sw01;

import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Kassenzettel.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Kassenzettel {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Produkt> produkte;
    private String geschaeftname;
    private String standort;
    private String tel;
    private int gesamtbetrag;

    /**
     * Default Konstruktor für die Klasse Kassenzettel
     */
    public Kassenzettel() {
        this.geschaeftname = "Keine Angaben";
        this.standort = "Keine Angaben";
        this.tel = "Keine Angaben";

        this.gesamtbetrag = 0;

        this.produkte = new ArrayList<Produkt>();
    }

    /**
     * Konstruktor für die Klasse Kassenzettel
     *
     * @param geschaeftname der Name des Geschäfts
     * @param standort      der Standort des Geschäfts
     * @param tel           die Telefonnummer des Geschäfts
     */
    public Kassenzettel(String geschaeftname, String standort, String tel) {
        this.geschaeftname = geschaeftname;
        this.standort = standort;
        this.tel = tel;

        this.gesamtbetrag = 0;

        this.produkte = new ArrayList<Produkt>();
    }

    /**
     * Fügt ein Produkt dem Kassenzettel hinzu.
     *
     * @param newProdukt das Produkt zum hinzufügen.
     */
    public void enrollProdukt(Produkt newProdukt) {
        produkte.add(newProdukt);
    }

    /**
     * Gibt den Kassenzettel aus.
     */
    public void printList() {
        System.out.println("MIGROS");
        System.out.println(this.geschaeftname);
        System.out.println(this.standort);
        System.out.println("TEL: " + this.tel);
        System.out.println("------------------");
        for (Produkt produkt : produkte) {
            produkt.print();
        }
        //System.out.println("TOTAL: " + numberOfStudents());
    }
}
