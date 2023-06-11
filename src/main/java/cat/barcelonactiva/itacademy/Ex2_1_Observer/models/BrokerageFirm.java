package cat.barcelonactiva.itacademy.Ex2_1_Observer.models;

import cat.barcelonactiva.itacademy.Ex2_1_Observer.interfaces.Observer;

public class BrokerageFirm implements Observer {

    private final String name;

    public BrokerageFirm(String name) {
        this.name = name;
    }

    @Override
    public void update(Object o) {
        System.out.println("Firm: " + name + " -- Received: " + o);
    }
}
