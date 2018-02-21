/*
 * Copyright 2017 Hochschule Luzern Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.oop.sw12.TemperaturGUI;

import ch.hslu.oop.sw10.Temperatur.Temperatur;
import ch.hslu.oop.sw11.Temperatur.Messpunkt;
import ch.hslu.oop.sw11.Temperatur.MesspunktVerlauf;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Einfaches SwitchGUI mit Java FX implementiert.
 */
@SuppressWarnings("restriction")
public final class TemperaturGuiJavaFx extends Application {

    private static final Logger LOGGER = LogManager.getLogger(TemperaturGuiJavaFx.class);

    @Override
    public void start(final Stage primaryStage) {

        primaryStage.setTitle("Temperatur Verlauf");

        final Label label = new Label("Bitte wählen Sie eine Datei zum einlesen.");

        final FileChooser fileChooser = new FileChooser();

        final Button btnWaehlen = new Button("Wählen");
        btnWaehlen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                File file = fileChooser.showOpenDialog(primaryStage);
                if (file != null) {
                    MesspunktVerlauf messpunktVerlauf = readFile(file);
                }
            }
        });

        final BorderPane borderPane = new BorderPane();
        //borderPane.setCenter(label);
        //borderPane.setCenter(btnWaehlen);

        final FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(5, 0, 5, 0));
        flowPane.setVgap(2);
        flowPane.setHgap(1);
        flowPane.getChildren().add(label);
        flowPane.getChildren().add(btnWaehlen);

        borderPane.setCenter(flowPane);

        //borderPane.setBottom(btnWaehlen);
        primaryStage.setScene(new Scene(borderPane, 400, 200));
        primaryStage.show();
    }

    /**
     * main-Methode startet die JavaFX-Application.
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        launch(TemperaturGuiJavaFx.class, args);
    }

    private MesspunktVerlauf readFile(File file) {
        MesspunktVerlauf messpunktVerlauf = new MesspunktVerlauf();

        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")))){
                String line;
                while ((line = br.readLine()) != null) {

                    String[] parts = line.split(";");
                    Float temp = Float.valueOf(parts[2]);

                    LocalDateTime timestamp = LocalDateTime.parse(parts[1],
                            DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

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

        return messpunktVerlauf;
    }
}