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
package ch.hslu.oop.sw14;

import ch.hslu.oop.sw13.Worker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demo-Applikation für Nebenläufigkeit (SW13).
 */
public final class WorkerDemo {

    private static final Logger LOGGER = LogManager.getLogger(WorkerDemo.class);

    /**
     * Privater Konstruktor.
     */
    private WorkerDemo() {
    }

    /**
     * Main-Methode.
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        Worker worker1 = new Worker();
        LOGGER.info("Worker 1 startet Work");
        //worker1.processWork();
        worker1.processWorkAsThread();
        LOGGER.info("Worker 1 finished Work");

        Worker worker2 = new Worker();
        LOGGER.info("Worker 2 startet Work");
        //worker2.processWork();
        worker2.processWorkAsThread();
        LOGGER.info("Worker 2 finished Work");

        Worker worker3 = new Worker();
        LOGGER.info("Worker 3 startet Work");
        //worker3.processWork();
        worker3.processWorkAsThread();
        LOGGER.info("Worker 3 finished Work");
    }
}
