package cat.barcelonactiva.itacademy.Ex2_2_Callback.services;

import cat.barcelonactiva.itacademy.Ex2_2_Callback.interfaces.Callback;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.interfaces.Store;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.models.Order;

public class ShoeStore implements Store, Callback {

    @Override
    public void call(Object o) {
        System.out.println("Order paid: " + o);
    }

    public void pay(Order order) {
        PaymentGateway.getInstance().pay(order, this);
    }
}
