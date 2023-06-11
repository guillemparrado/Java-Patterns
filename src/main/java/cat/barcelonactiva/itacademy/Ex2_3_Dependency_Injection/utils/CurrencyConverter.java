package cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.utils;

import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.Currency;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.ExchangeRate;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.Price;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    Map<String, ExchangeRate> rates = new HashMap<>();

    public Price convert(Price price, Currency dstCurrency) {

        if (price.getCurrency() == dstCurrency)
            return price;

        ExchangeRate rate = getRate(price.getCurrency(), dstCurrency);
        double rateValue = rate.getValue();

        // Rate{EUR,USD,1.12} means that 1 EUR is worth 1.12 USD
        if (price.getCurrency() == rate.getCurrencies()[1])
            rateValue = 1 / rateValue;

        return new Price(
                price.getAmount().doubleValue() * rateValue,
                dstCurrency);
    }

    public void addRate(ExchangeRate rate) {
        Currency[] c = rate.getCurrencies();

        // A convenience to be able to access same rate with both indexes
        rates.put(c[0].symbol() + c[1].symbol(), rate);
        rates.put(c[1].symbol() + c[0].symbol(), rate);
    }

    private ExchangeRate getRate(Currency c1, Currency c2) {
        return rates.get(c1.symbol() + c2.symbol());
    }

}
