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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller für SwitchGui mit JavaFX und FXML. GUI-Komponenenten werden anhand der IDs injected.
 */
@SuppressWarnings("restriction")
public final class SwitchGuiJavaFxmlController implements Initializable {

    @FXML
    private Button btnOn;

    @FXML
    private Button btnOff;

    @FXML
    private Label label;

    /*
     * (non-Javadoc)
     * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
     */
    @Override
    public void initialize(final URL arg0, final ResourceBundle arg1) {
        btnOn.setOnAction(this::setOnAction);
        btnOff.setOnAction(this::setOffAction);
    }

    /**
     * Behandlung des On-Buttons.
     * @param event Event.
     */
    private void setOnAction(final ActionEvent event) {
        label.setText("The switch is ON.");
    }

    /**
     * Behandlung des Off-Buttons.
     * @param event Event.
     */
    private void setOffAction(final ActionEvent event) {
        label.setText("The switch is OFF.");
    }

}
