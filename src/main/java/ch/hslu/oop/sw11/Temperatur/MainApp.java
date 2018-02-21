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
package ch.hslu.oop.sw11.Temperatur;

import ch.hslu.oop.sw10.Temperatur.Temperatur;
import ch.hslu.oop.sw10.Temperatur.TemperaturEvent;
import ch.hslu.oop.sw10.Temperatur.TemperaturEventListener;
import ch.hslu.oop.sw10.Temperatur.TemperaturVerlauf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Übungen: Datenströme (SW11)
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

        final String filename = "/Users/fabiangroger/Dropbox/Schule/Studium/I.BA_OOP.H17/Modulunterlagen/SW11/netatmo-export-201608-201610.csv";

        MesspunktVerlauf messpunktVerlauf = new MesspunktVerlauf();

        if (new File(filename).exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), Charset.forName("UTF-8")))){
                String line;
                while ((line = br.readLine()) != null) {
                    //LOGGER.info(line);

                    String[] parts = line.split(";");

                    Float temp = Float.valueOf(parts[2]);
                    //LOGGER.info("Temperatur: " + temp);

                    LocalDateTime timestamp = LocalDateTime.parse(parts[1],
                            DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
                    //LOGGER.info("Timestamp: " + timestamp);

                    Temperatur temperatur = Temperatur.createFromCelsius(temp);
                    Messpunkt messpunkt = new Messpunkt(temperatur, timestamp);
                    messpunktVerlauf.add(messpunkt);
                }

            } catch (IOException ioex) {
                LOGGER.error(ioex.getMessage(), ioex);
            } finally {
                LOGGER.info("Anzahl Temperaturwerte: " + messpunktVerlauf.getCount());
                LOGGER.info("Durchschnitts Temperatur: " + messpunktVerlauf.durchschnitt().toString());
                LOGGER.info("Minimale Temperatur: " + messpunktVerlauf.min().getTemperatur().toString());
                LOGGER.info("Minimale Temperatur Zeit: " + messpunktVerlauf.min().getDateTime().toString());
                LOGGER.info("Maximale Temperatur: " + messpunktVerlauf.max().getTemperatur().toString());
                LOGGER.info("Maximale Temperatur Zeit: " + messpunktVerlauf.max().getDateTime().toString());
            }
        }
    }
}
