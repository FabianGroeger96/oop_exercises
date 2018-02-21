package ch.hslu.oop.sw05;

/**
 * Abstrakte Klasse Shape - beschreiben Sie hier die Klasse
 * 
 * @author Fabian Gröger
 * @version 17.10.2017
 */
public abstract class Shape {
    
    private int x;
    private int y;
    
    protected Shape(final int x, final int y) { 
        this.x = x;
        this.y = y; 
    }
    
    public final void move(final int newX, final int newY) { 
        this.x = newX;
        this.y = newY; 
    }
    
    public final int getX(){
        return this.x;
    }
    
    public final int getY(){
        return this.y;
    }
    
    public abstract int getPerimeter();
    
    public abstract int getArea();
}
