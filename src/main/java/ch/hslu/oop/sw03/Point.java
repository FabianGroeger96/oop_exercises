package ch.hslu.oop.sw03;

/**
 * Beschreiben Sie hier die Klasse Point.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point
{
    // Instanzvariablen
    private int x;
    private int y;

    /**
     * Konstruktor für Objekte der Klasse Point
     */
    public Point() {
        // Instanzvariable initialisieren
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x, int y) {
        // Instanzvariable initialisieren
        this.x = x;
        this.y = y;
    }
    
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getQuadrant() {
        if(x > 0 && y > 0) {
            return 1;
        } else if(x < 0 && y > 0) {
            return 2;
        } else if(x < 0 && y < 0) {
            return 3;
        } else if(x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
}
