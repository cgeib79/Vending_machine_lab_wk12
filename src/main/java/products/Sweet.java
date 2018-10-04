package products;

public class Sweet extends Product {

    String type;
    Drawer drawer;

    public Sweet(String name, String brand, String type, Drawer drawer) {
        super(name, brand);
        this.type = type;
        this.drawer = drawer;
    }


    public String getType() {
        return this.type;
    }
}
