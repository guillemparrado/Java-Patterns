package cat.barcelonactiva.itacademy.Ex2_2_Callback;

import cat.barcelonactiva.itacademy.Ex2_2_Callback.interfaces.Store;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.models.AccountDebitPayment;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.models.CreditCardPayment;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.models.Order;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.models.PaypalPayment;
import cat.barcelonactiva.itacademy.Ex2_2_Callback.services.ShoeStore;

public class Main {
    public static void main(String[] args) {
        Store shoeStore = new ShoeStore();

        Order o = new Order(new CreditCardPayment(), 53);
        shoeStore.pay(o);

        Order o2 = new Order(new PaypalPayment(), 22);
        shoeStore.pay(o2);

        Order o3 = new Order(new AccountDebitPayment(), 100);
        shoeStore.pay(o3);
    }
}
