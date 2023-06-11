package cat.barcelonactiva.itacademy.Ex2_3_Dependency_Injection.model;

public class Article {
    private final String name;
    private final Price price;

    public Article(String name, double amount, Currency currency) {
        this.name = name;
        this.price = new Price(amount, currency);
    }


    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{ " +
                "name: '" + name + '\'' +
                ", price: " + price +
                " }";
    }
}
