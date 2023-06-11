package cat.barcelonactiva.itacademy.Ex2_2_Callback.services;

import cat.barcelonactiva.itacademy.Ex2_2_Callback.interfaces.Callback;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.models.Order;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.models.Payment;

public class PaymentGateway {

    static private PaymentGateway instance;

    private PaymentGateway(){
    }

    static public PaymentGateway getInstance(){
        instance = instance == null ? new PaymentGateway() : instance;
        return instance;
    }

    public void pay(Order o, Callback c){
        o.fill();
        c.call(o);
    }
}
