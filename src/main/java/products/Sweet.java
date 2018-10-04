package products;

public class Sweet extends Product {

    String type;

    public Sweet(String name, String brand, String type) {
        super(name, brand);
        this.type = type;
    }


    public String getType() {
        return this.type;
    }
}
