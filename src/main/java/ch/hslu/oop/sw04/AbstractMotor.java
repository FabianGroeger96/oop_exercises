package ch.hslu.oop.sw04;

/**
 * Abstrakte Klasse Motor - beschreiben Sie hier die Klasse
 * 
 * @author Fabian Gröger
 * @version 10.10.2017
 */
public abstract class AbstractMotor implements Switchable {
    
    private boolean running = false;
    private int rpm = 0;
    private int fuel = 0;
    
    public abstract boolean hasFuel();
    
    public abstract void fillFuel();
    
    public abstract int zylinder();
    
    public abstract void run();
    
    @Override
    public void switchOn(){
        this.running = true;
        this.rpm = 100;
    }
    
    @Override
    public void switchOff(){
        this.running = false;
        this.rpm = 0;
    }
    
    @Override
    public boolean isSwitchedOn(){
        if(this.running == true){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isSwitchedOff(){
        if(this.running == true){
            return false;
        } else {
            return true;
        }
    }
}
