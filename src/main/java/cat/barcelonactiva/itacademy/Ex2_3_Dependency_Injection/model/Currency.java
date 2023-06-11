package cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model;

import java.util.Objects;

public record Currency(String name, String symbol, int decimalPoint) implements Comparable<Currency> {

    @Override
    public String toString() {
        return "{ name: '" + name + '\'' +
                ", symbol: '" + symbol + '\'' +
                ", decimalPoint: " + decimalPoint +
                " }";
    }


    @Override
    public int compareTo(Currency o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return decimalPoint == currency.decimalPoint && Objects.equals(name, currency.name) && Objects.equals(symbol, currency.symbol);
    }

}
