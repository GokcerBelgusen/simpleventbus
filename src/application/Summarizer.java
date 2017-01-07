package application;

import simpleeventbus.EventHandler;

/**
 * Created by gokcerbelgusen on 07/01/2017.
 */
public class Summarizer {

    @EventHandler
    public void inMemoryCounter(String event) {
        System.out.println("In-Memory counting..." + event);
    }
}
