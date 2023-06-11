package cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model;

public class ExchangeRate {
    private final Currency[] currencies;
    private final double value;

    public ExchangeRate(Currency c1, Currency c2, double rate) {
        if (c1.compareTo(c2) < 0) {
            this.currencies = new Currency[]{c1, c2};
            this.value = rate;
        } else {
            this.currencies = new Currency[]{c2, c1};
            this.value = 1 / rate;
        }
    }

    public Currency[] getCurrencies() {
        return currencies;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{ Curr1: " + currencies[0] + ", Curr2: " + currencies[1] + ", Rate: "
                + value + " }";
    }
}
