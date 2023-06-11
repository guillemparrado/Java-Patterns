package cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.utils;

import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.Article;
import cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model.Currency;

public class PriceLogger {
    private final CurrencyConverter cc;

    public PriceLogger(CurrencyConverter cc) {
        this.cc = cc;
    }

    public void logPrice(Article article, Currency currency) {
        System.out.println("The article \"" + article.getName() + "\" is worth " + cc.convert(article.getPrice(),
                currency));
    }

}
