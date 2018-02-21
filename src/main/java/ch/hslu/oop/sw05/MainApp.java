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
package ch.hslu.oop.sw05;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demo-Applikation für {@link Shape}, {@link Rectangle} und {@link Circle}-Klasse.
 */
public final class MainApp {

    private static final Logger LOGGER = LogManager.getLogger(MainApp.class);

    /**
     * X-Wert. Beispiel.
     */
    private static final int COR_X = 2;

    /**
     * Y-Wert. Beispiel.
     */
    private static final int COR_Y = -1;

    /**
     * Width-Wert. Beispiel.
     */
    private static final int COR_WIDTH = 5;

    /**
     * Height-Wert. Beispiel.
     */
    private static final int COR_HEIGHT = 6;

    /**
     * Diameter-Wert. Beispiel.
     */
    private static final int COR_DIAMETER = 6;

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
        final Rectangle rectangle = new Rectangle(COR_X, COR_Y, COR_WIDTH, COR_HEIGHT);
        final Circle circle = new Circle(COR_X, COR_Y, COR_DIAMETER);

        LOGGER.info("Fläche des Quadrats: " + rectangle.getArea());
        LOGGER.info("Umfang des Quadrats: " + rectangle.getPerimeter());

        LOGGER.info("Fläche des Kreises: " + circle.getArea());
        LOGGER.info("Umfang des Kreises: " + circle.getPerimeter());
    }
}
