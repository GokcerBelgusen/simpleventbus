package application;


import simpleeventbus.EventHandler;

public class TestHandler {

    @EventHandler
    public void handleString(String event) {
        System.out.println(event);

    }
}
