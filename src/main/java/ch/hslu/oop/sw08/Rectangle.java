package ch.hslu.oop.sw08;

/**
 * Beschreiben Sie hier die Klasse Rectangle.
 * 
 * @author Fabian Gröger
 * @version 7.11.2017
 */
public final class Rectangle extends Shape {
    
    private int width;
    private int height;
    
    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public void changeDimension(final int newWidth, final int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    @Override
    public int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }
    
    @Override
    public int getArea() {
        return this.width * this.height;
    }
}
