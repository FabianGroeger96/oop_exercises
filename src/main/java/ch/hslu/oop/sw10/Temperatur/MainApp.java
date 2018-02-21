/*
 * Copyright 2016 Roland Gisler
 * Hochschule Luzern Informatik, Switzerland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.oop.sw10.Temperatur;

import ch.hslu.oop.sw10.Temperatur.Temperatur;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Übungen: Fehlerhandling / Exceptions / Logging (SW09)
 */
public final class MainApp {

    private static final Logger LOGGER = LogManager.getLogger(MainApp.class);

    /**
     * Privater Konstruktor.
     */
    private MainApp() {
    }

    /**
     * Main-Methode.
     *
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();
        temperaturVerlauf.addTemperaturEventListener(new TemperaturEventListener() {
            @Override
            public void temperaturEvent(TemperaturEvent temperaturEvent) {
                LOGGER.info("Es wurde ein neues " + temperaturEvent.getTemperaturState().getText() + " eingegeben");
            }
        });

        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();

            if(!input.equals("exit")){
                try{
                    float value = Float.valueOf(input);
                    Temperatur temperatur = Temperatur.createFromCelsius(value);

                    temperaturVerlauf.add(temperatur);

                    //System.out.println(temperatur.toString());
                    LOGGER.info(temperatur.toString());
                } catch (Exception e){
                    //System.out.println("Keine gültige Temperatur eingegeben");
                    LOGGER.error("Keinen Gültigen Temperaturwert eingegeben", new IllegalArgumentException("Keinen Gültigen Temperaturwert eingegeben"));
                }
            } else {
                LOGGER.info("Anzahl Temperaturwerte: " + temperaturVerlauf.getCount());
                LOGGER.info("Durchschnitts Temperatur: " + temperaturVerlauf.durchschnitt());
                LOGGER.info("Minimale Temperatur: " + temperaturVerlauf.min());
                LOGGER.info("Maximale Temperatur: " + temperaturVerlauf.max());
            }
        } while (!input.equals("exit"));

        //System.out.println("Programm beendet.");
        LOGGER.info("Programm beendet.");
    }
}
