package cat.barcelonactiva.itacademy.Ex2_2_Callback.models;

import java.time.LocalDateTime;

public class Order {
    private Payment payment;
    private int amount;
    private LocalDateTime time;

    public void fill() {
        time = LocalDateTime.now();
    }

    public Order(Payment payment, int amount) {
        this.payment = payment;
        this.amount = amount;
    }

    public Payment getPayment() {
        return payment;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "{ Payment: " + payment.getClass().getSimpleName() + ", Amount: " + amount + " €, Time: " + time + " }";
    }
}
