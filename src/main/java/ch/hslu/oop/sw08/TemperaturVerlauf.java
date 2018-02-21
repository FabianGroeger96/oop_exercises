package ch.hslu.oop.sw08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Aufgabe final und static, Enums und Collections (SW08)
 *
 * @author Fabian Gröger
 * @version 7.11.2017
 */
public class TemperaturVerlauf  {

    List<Temperatur> temperaturArrayList = new ArrayList<>();

    public final void add(final Temperatur temperatur){
        temperaturArrayList.add(temperatur);
    }

    public final void clear(){
        temperaturArrayList.clear();
    }

    public final int getCount(){
        return temperaturArrayList.size();
    }

    public final Temperatur max(){
        if (temperaturArrayList.size() > 0){
            Collections.sort(temperaturArrayList, Collections.reverseOrder());
            return temperaturArrayList.get(0);
        } else {
            return null;
        }
    }

    public final Temperatur min(){
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
            for(final Temperatur temperatur : temperaturArrayList) {
                total += temperatur.getTempCelsius();
                anz++;
            }

            return new Temperatur(total / anz);
        } else {
            return null;
        }
    }
}
