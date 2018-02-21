package ch.hslu.oop.sw10.Auto;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasse Motor - beschreiben Sie hier die Klasse
 * 
 * @author Fabian Gröger
 * @version 21.11.2017
 */
public class Motor implements Switchable {

    private int rpm;
    private MotorState state;
    // Datenstruktur zur Speicherung aller Listener.
    private final List<PropertyChangeListener> changeListeners = new ArrayList<PropertyChangeListener>();

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm() {
        return this.rpm;
    }

    @Override
    public void switchOn(){
        if (isSwitchedOff()) {
            this.state = MotorState.ON;
            this.rpm = 100;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.OFF, MotorState.ON);
            this.firePropertyChangeEvent(pcEvent);
        }
    }
    
    @Override
    public void switchOff(){
        if (isSwitchedOn()) {
            this.state = MotorState.OFF;
            this.rpm = 0;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.ON, MotorState.OFF);
            this.firePropertyChangeEvent(pcEvent);
        }
    }
    
    @Override
    public boolean isSwitchedOn(){
        if(this.rpm > 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean isSwitchedOff(){
        if(this.rpm == 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Registriert einen PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if (!listener.equals(null)){
            this.changeListeners.add(listener);
        }
    }

    /**
     * Deregistriert einen PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if (!listener.equals(null)){
            this.changeListeners.remove(listener);
        }
    }

    /**
     * Informiert alle PropertyChangeListeners über PropertyChangeEvent.
     * @param pcEvent PropertyChangeEvent.
     */
    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }
    }

}
