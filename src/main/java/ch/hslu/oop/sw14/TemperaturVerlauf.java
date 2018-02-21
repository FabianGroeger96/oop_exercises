package ch.hslu.oop.sw14;

import ch.hslu.oop.sw08.Temperatur;

import java.util.*;

/**
 * Aufgabe final und static, Enums und Collections (SW08)
 *
 * @author Fabian Gröger
 * @version 7.11.2017
 */
public class TemperaturVerlauf {

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
        temperaturArrayList.stream().filter(Objects::nonNull).sorted(Comparator.reverseOrder());
        return temperaturArrayList.get(0);

//        if (temperaturArrayList.size() > 0){
//            Collections.sort(temperaturArrayList, Collections.reverseOrder());
//            return temperaturArrayList.get(0);
//        } else {
//            return null;
//        }
    }

    public final Temperatur min(){
        temperaturArrayList.stream().filter(Objects::nonNull).sorted();
        return temperaturArrayList.get(0);

//        if (temperaturArrayList.size() > 0){
//            Collections.sort(temperaturArrayList);
//            return temperaturArrayList.get(0);
//        } else {
//            return null;
//        }
    }

    public final Temperatur durchschnitt(){
        float total = 0;
        int anz = 0;

        anz = temperaturArrayList.size();
        total = temperaturArrayList.stream().mapToInt(t -> ((int) t.getTempCelsius())).sum();
        return new Temperatur(total / anz);

//        if (temperaturArrayList.size() > 0){
//            for(final Temperatur temperatur : temperaturArrayList) {
//                total += temperatur.getTempCelsius();
//                anz++;
//            }
//
//            return new Temperatur(total / anz);
//        } else {
//            return null;
//        }
    }
}
