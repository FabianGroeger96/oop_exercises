package ch.hslu.oop.sw05;

/**
 * Beschreiben Sie hier die Klasse Circle.
 * 
 * @author Fabian Gröger 
 * @version 17.10.2017
 */
public final class Circle extends Shape {
    private int diameter;
    
    public Circle(final int x, final int y, final int diameter) {

        super(x, y);
        this.diameter = diameter;
    }
    
    public void setDiameter(final int diameter) {

        this.diameter = diameter;
    }
    
    public int getDiameter() {

        return this.diameter;
    }
    
    @Override
    public int getPerimeter() {

        return 2 * 3 * this.diameter;
    }
    
    @Override
    public int getArea() {

        return 3 * (this.diameter * this.diameter);
    }
}
