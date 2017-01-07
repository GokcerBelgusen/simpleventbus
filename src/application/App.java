package application;

import simpleeventbus.EventDispatcher;

public class App {

    public static void main(String[] args) {
        EventDispatcher disp = new EventDispatcher();

        TestHandler handler = new TestHandler();
        DataIngestHandler dataIngestHandler = new DataIngestHandler();
        Summarizer summarizer = new Summarizer();

        disp.addHandler(handler);
        disp.addHandler(dataIngestHandler);
        disp.addHandler(summarizer);

        disp.publish("Hello");
    }
}
