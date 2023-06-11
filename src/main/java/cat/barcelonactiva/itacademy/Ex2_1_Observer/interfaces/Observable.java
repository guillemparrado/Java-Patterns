package cat.barcelonactiva.itacademy.Ex2_1_Observer.interfaces;

public interface Observable {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(Object o);
}
