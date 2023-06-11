package cat.barcelonactiva.itacademy.Ex2_1_Observer.models;

import cat.barcelonactiva.itacademy.Ex2_1_Observer.enums.Ticker;
import cat.barcelonactiva.itacademy.Ex2_1_Observer.interfaces.Observable;
import cat.barcelonactiva.itacademy.Ex2_1_Observer.interfaces.Observer;

import java.time.LocalDateTime;
import java.util.*;

public class StockBroker implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private final Map<Ticker, Integer> lastPrice = new HashMap<>();
    private final Random rand = new Random();
    private final Timer timer = new Timer();

    public StockBroker() {

        for(Ticker ticker : Ticker.values())
            lastPrice.put(ticker, rand.nextInt(2000, 10000));
    }

    public void run(){
        new SendRandomUpdate().run();
    }

    private class SendRandomUpdate extends TimerTask {
        @Override
        public void run() {
            Ticker randomTicker = (Ticker) lastPrice.keySet().toArray()[rand.nextInt(lastPrice.size())];
            int randomPrice = lastPrice.get(randomTicker) + rand.nextInt(-5, 5);

            Update update = new Update(
                    randomTicker,
                    randomPrice,
                    LocalDateTime.now()
            );

            notifyObservers(update);
            timer.schedule(new SendRandomUpdate(), rand.nextInt(1000));
        }
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Object obj) {
        for(Observer obs : observers)
            obs.update(obj);
    }
}
