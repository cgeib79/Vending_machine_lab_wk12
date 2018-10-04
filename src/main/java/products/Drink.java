package products;

public class Drink extends Product {

    String type;

    public Drink(String name, String brand, String type) {
        super(name, brand);
        this.type = type;
    }
}
