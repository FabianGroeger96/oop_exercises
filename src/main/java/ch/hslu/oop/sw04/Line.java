package ch.hslu.oop.sw04;

/**
 * Beschreiben Sie hier die Klasse Line.
 * 
 * @author Fabian Gröger
 * @version 10.10.2017
 */
public class Line
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //private int x1;
    //private int x2;
    //private int y1;
    //private int y2;
    
    private Point startPoint;
    private Point endPoint;

    public Line() {
        // Instanzvariable initialisieren
        //this.x1 = 0;
        //this.x2 = 0;
        //this.y1 = 0;
        //this.y2 = 0;
        
        this.startPoint = new Point();
        this.endPoint = new Point();
    }
    
    public Line(final int x1, final int y1, final int x2, final int y2) {
        // Instanzvariable initialisieren
        //this.x1 = x1;
        //this.x2 = x2;
        //this.y1 = y1;
        //this.y2 = y2;
        
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }
    
    public Point getStartPoint() {
        //System.out.println("Startpunkt: ");
        //System.out.println("x: " + this.startPoint.getX());
        //System.out.println("y: " + this.startPoint.getY());
        
        return this.startPoint;
    }
    
    public void setStartPoint(final Point startPoint) {
        this.startPoint.setCoordinates(startPoint.getX(), startPoint.getY());
    }
    
    public void setStartPoint(final int x, final int y) {
        this.startPoint.setCoordinates(x, y);
    }
    
    public Point getEndPoint() {
        //System.out.println("Endpunkt: ");
        //System.out.println("x: " + this.endPoint.getX());
        //System.out.println("y: " + this.endPoint.getY());
        
        return this.endPoint;
    }
    
    public void setEndPoint(final Point endPoint) {
        this.endPoint.setCoordinates(endPoint.getX(), endPoint.getY());
    }
    
    public void setEndPoint(final int x, final int y) {
        this.endPoint.setCoordinates(x, y);
    }
}
