package application;

import simpleeventbus.EventHandler;

/**
 * Created by gokcerbelgusen on 07/01/2017.
 */
public class DataIngestHandler {

    @EventHandler
    public void ingestData(String event) {
        System.out.println("Ingesting data into database..." + event);
    }
}
