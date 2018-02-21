package ch.hslu.oop.sw13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Worker {

    private static final Logger LOGGER = LogManager.getLogger(Worker.class);

    private String name;
    private int number;

    public Worker(){}

    public Worker(final String name, final int number){
        this.name = name;
        this.number = number;
    }

    public int processWork(){
        try {
            LOGGER.info("startet Work");
            Thread.sleep(1000);
            LOGGER.info("finished Work");
            return 0;
        } catch (InterruptedException e) {
            e.printStackTrace();
            LOGGER.info("error Work");
            return 1;
        }
    }

    public void processWorkAsThread() {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                processWork();
            } });
        thread.start();
    }

    public int add(final int a, final int b){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("a: " + a);
        LOGGER.info("b: " + b);
        LOGGER.info("Result: " + (a + b));
        return a + b;
    }
}
