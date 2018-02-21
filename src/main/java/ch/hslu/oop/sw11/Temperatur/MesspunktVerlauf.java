package ch.hslu.oop.sw11.Temperatur;

import ch.hslu.oop.sw10.Temperatur.Temperatur;
import ch.hslu.oop.sw10.Temperatur.TemperaturEvent;
import ch.hslu.oop.sw10.Temperatur.TemperaturEventListener;
import ch.hslu.oop.sw10.Temperatur.TemperaturState;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MesspunktVerlauf {
    List<Messpunkt> temperaturArrayList = new ArrayList<>();

    // Datenstruktur zur Speicherung aller Listener.
    private final List<TemperaturEventListener> changeListeners = new ArrayList<TemperaturEventListener>();

    public final void add(final Messpunkt messpunkt){

        temperaturArrayList.add(messpunkt);

        if (temperaturArrayList.size() > 1){
            Temperatur minTemperatur = min().getTemperatur();
            Temperatur maxTemperatur = max().getTemperatur();

            if (minTemperatur.equals(messpunkt.getTemperatur())){
                final TemperaturEvent pcEvent = new TemperaturEvent(this, TemperaturState.MIN);
                this.fireTemperaturEvent(pcEvent);
            } else if (maxTemperatur.equals(messpunkt.getTemperatur())){
                final TemperaturEvent pcEvent = new TemperaturEvent(this, TemperaturState.MAX);
                this.fireTemperaturEvent(pcEvent);
            }
        }
    }

    public final void clear(){
        temperaturArrayList.clear();
    }

    public final int getCount(){
        return temperaturArrayList.size();
    }

    public final Messpunkt get(final int index){
        return temperaturArrayList.get(index);
    }

    public final Messpunkt max(){
        List<Messpunkt> list = temperaturArrayList;

        if (list.size() > 0){
            Collections.sort(list, Collections.reverseOrder());
            return list.get(0);
        } else {
            return null;
        }
    }

    public final Messpunkt sortMax(){
        if (temperaturArrayList.size() > 0){
            Collections.sort(temperaturArrayList, Collections.reverseOrder());
            return temperaturArrayList.get(0);
        } else {
            return null;
        }
    }

    public final Messpunkt min(){
        List<Messpunkt> list = temperaturArrayList;

        if (list.size() > 0){
            Collections.sort(list);
            return list.get(0);
        } else {
            return null;
        }
    }

    public final Messpunkt sortMin(){
        if (temperaturArrayList.size() > 0){
            Collections.sort(temperaturArrayList);
            return temperaturArrayList.get(0);
        } else {
            return null;
        }
    }

    public final Temperatur durchschnitt(){
        float total = 0;
        int anz = 0;

        if (temperaturArrayList.size() > 0){
            for(final Messpunkt messpunkt : temperaturArrayList) {
                total += messpunkt.getTemperatur().getTempCelsius();
                anz++;
            }

            return Temperatur.createFromCelsius(total / anz);
        } else {
            return null;
        }
    }

    /**
     * Registriert einen TemperaturEventListener.
     * @param listener TemperaturEventListener.
     */
    public void addTemperaturEventListener(final TemperaturEventListener listener) {
        this.changeListeners.add(listener);
    }

    /**
     * Deregistriert einen TemperaturEventListener.
     * @param listener TemperaturEventListener.
     */
    public void removePropertyChangeListener(final TemperaturEventListener listener) {
        this.changeListeners.remove(listener);
    }

    /**
     * Informiert alle TemperaturEventListener über TemperaturEvent.
     * @param pcEvent TemperaturEvent.
     */
    private void fireTemperaturEvent(final TemperaturEvent pcEvent) {
        for (final TemperaturEventListener listener : this.changeListeners) {
            listener.temperaturEvent(pcEvent);
        }
    }
}
