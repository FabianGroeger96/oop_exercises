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
package ch.hslu.oop.sw12.javafxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * SwitchGUI mit Java FX und FXML implementiert.
 */
@SuppressWarnings("restriction")
public final class SwitchGuiJavaFxmlDemo extends Application {

    @Override
    public void start(final Stage stage) {

        stage.setTitle("Switch GUI with JavaFX und FXML");
        Parent pane;
        try {
            final URL fxmlUrl = getClass().getResource("SwitchGuiJavaFxml.fxml");
            final FXMLLoader fxmlLoader = new FXMLLoader(fxmlUrl);
            fxmlLoader.setController(new SwitchGuiJavaFxmlController());
            pane = fxmlLoader.load();
            stage.setScene(new Scene(pane, 200, 100));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * main-Methode startet die JavaFX-Application.
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        launch(args);
    }
}