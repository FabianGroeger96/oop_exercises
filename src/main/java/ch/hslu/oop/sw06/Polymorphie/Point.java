package ch.hslu.oop.sw06.Polymorphie;

/**
 * Beschreiben Sie hier die Klasse Point.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point {
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

    public Point(Point point) {
        this(point.getX(), point.getY());
    }
    
    public void setCoordinates(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {

        return this.x;
    }
    
    public void setX(final int x) {

        this.x = x;
    }
    
    public int getY() {

        return this.y;
    }
    
    public void setY(final int y) {

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

    public void moveRelative(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public void moveRelative(Point point) {
        moveRelative(point.getX(), point.getY());
    }
}
