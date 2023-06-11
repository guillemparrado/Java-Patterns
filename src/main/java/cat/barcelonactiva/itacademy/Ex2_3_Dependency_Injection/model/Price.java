package cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Price {
    private final Currency currency;
    private final BigDecimal amount;

    public Price(double amount, Currency currency) {
        this.currency = currency;
        this.amount = new BigDecimal(amount).setScale(currency.decimalPoint(), RoundingMode.HALF_EVEN);
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return amount + " " + currency.symbol();
    }
}
