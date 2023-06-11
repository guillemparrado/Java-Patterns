package cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection;

import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.Article;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.Currency;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.ExchangeRate;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.Price;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.utils.CurrencyConverter;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.utils.PriceLogger;

public class App {
    public static void main(String[] args) {

        Currency eur = new Currency("Euro", "€", 2);
        Currency usd = new Currency("US Dollar", "$", 2);
        Currency gbp = new Currency("British Pound", "£", 2);

        CurrencyConverter cc = new CurrencyConverter();
        cc.addRate(new ExchangeRate(eur, usd, 1.07));
        cc.addRate(new ExchangeRate(gbp, usd, 1.26));
        cc.addRate(new ExchangeRate(gbp, eur, 1.17));

        // Dependency injection
        PriceLogger pl = new PriceLogger(cc);
        Article coolBoots = new Article("Cool Boots", 20.99, eur);

        // Debug prints
        System.out.println("Currency toString(): " + eur);
        System.out.println("Price toString(): " + new Price(20.99, eur));
        System.out.println("Article toString(): " + coolBoots);
        System.out.println("ExchangeRate toString(): " + new ExchangeRate(eur, usd, 1.07));

        // Logger prints
        pl.logPrice(coolBoots, eur);
        pl.logPrice(coolBoots, usd);
        pl.logPrice(coolBoots, gbp);
    }
}
