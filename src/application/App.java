package application;

import simpleeventbus.EventDispatcher;

public class App {

    public static void main(String[] args) {
        EventDispatcher disp = new EventDispatcher();
        TestHandler handler = new TestHandler();
        disp.addHandler(handler);
        disp.publish("Hello");
    }
}
