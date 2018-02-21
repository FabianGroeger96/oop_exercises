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
package ch.hslu.oop.sw11.Datenstroeme;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

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

        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("/Users/fabiangroger/Desktop/demo.txt"))) {

            //dataOutputStream.writeInt(4545);
            dataOutputStream.writeUTF("% Test %");

        } catch (IOException ioe){
            LOGGER.error("Datei konnte nicht geschrieben werden", ioe);
        }

        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("/Users/fabiangroger/Desktop/demo.txt"))) {

            //final int value = dataInputStream.readInt();
            //final byte value = dataInputStream.readByte();
            //final float value = dataInputStream.readFloat();
            final String value = dataInputStream.readUTF();

            LOGGER.info("Ausgelesener Wert: " + value);

        } catch (IOException ioe){
            LOGGER.error("Datei konnte nicht gelesen werden", ioe);
        }
    }
}
