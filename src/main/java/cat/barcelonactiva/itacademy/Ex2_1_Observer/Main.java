package cat.barcelonactiva.itacademy.Ex2_1_Observer;

import cat.barcelonactiva.itacademy.Ex2_1_Observer.interfaces.Observer;
import cat.barcelonactiva.itacademy.Ex2_1_Observer.models.BrokerageFirm;
import cat.barcelonactiva.itacademy.Ex2_1_Observer.models.StockBroker;

public class Main {
    public static void main(String[] args) {

        StockBroker sb = new StockBroker();
        Observer bf1 = new BrokerageFirm("Get Rich Quick");
        Observer bf2 = new BrokerageFirm("Ponzi & Co.");
        Observer bf3 = new BrokerageFirm("Shady Investments LLC");

        sb.register(bf1);
        sb.register(bf2);
        sb.register(bf3);
        sb.unregister(bf1);

        sb.run();
    }
}