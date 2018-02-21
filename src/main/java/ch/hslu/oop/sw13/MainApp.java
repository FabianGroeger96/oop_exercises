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
package ch.hslu.oop.sw13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Demo-Applikation für Nebenläufigkeit (SW13).
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
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        final ExecutorService execSvc = Executors.newFixedThreadPool(5);

        List<Callable<Integer>> callableList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            final Callable<Integer> workerA = new WorkerCallable(new Worker("Worker" + i, new Random().nextInt(1000)));
            callableList.add(workerA);
        }

        List<Future<Integer>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            final Future<Integer> result = execSvc.submit(callableList.get(i));
            futureList.add(result);
        }

        for (int i = 0; i < 10; i++){
            try {
                LOGGER.info("Resultat von Worker" + i + ": " + futureList.get(i).get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    private static class WorkerCallable implements Callable<Integer> {
        private final Random random = new Random();

        private Worker worker;

        public WorkerCallable(final Worker worker) {
            this.worker = worker;
        }

        @Override
        public Integer call() throws Exception {
            return worker.add(random.nextInt(50),random.nextInt(50));
        }
    }
}
