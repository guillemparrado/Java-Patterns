package cat.barcelonactiva.itacademy.Ex2_1_Observer.models;

import cat.barcelonactiva.itacademy.Ex2_1_Observer.enums.Ticker;
import java.time.LocalDateTime;

public record Update(Ticker ticker, int price, LocalDateTime time) {

    @Override
    public String toString() {
        return "{" +
                "ticker: " + ticker +
                ", price: " + price +
                ", time: " + time +
                '}';
    }
}
