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
package ch.hslu.oop.sw14.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Einfaches SwitchGUI mit Java FX implementiert.
 */
@SuppressWarnings("restriction")
public final class SwitchGuiJavaFxDemo extends Application {

    @Override
    public void start(final Stage primaryStage) {

        primaryStage.setTitle("Switch GUI with JavaFX");

        final Label label = new Label("The switch is OFF.");

        final Button btnOn = new Button("On");
        btnOn.setOnAction(event -> {
            label.setText("The switch is ON.");
            label.setStyle("-fx-background-color: lightgreen;");
        });

        final Button btnOff = new Button("Off");
        btnOff.setOnAction(event -> {
            label.setText("The switch is OFF.");
            label.setStyle("-fx-background-color: red;");
        });

        final BorderPane borderPane = new BorderPane();
        borderPane.setTop(btnOn);
        borderPane.setCenter(label);
        borderPane.setBottom(btnOff);
        primaryStage.setScene(new Scene(borderPane, 200, 100));
        primaryStage.show();
    }

    /**
     * main-Methode startet die JavaFX-Application.
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        launch(SwitchGuiJavaFxDemo.class, args);
    }
}