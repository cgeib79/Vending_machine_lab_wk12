public class VendingMachine {

    private String products;
//    private double coin;
    private double price;



    public VendingMachine(String products, double price) {
        this.products = products;
        this.price = price;
    }

    public String getProduct() {
        return this.products;
    }

    public double getPrice() {
        return this.price;
    }


//    public double getCoin() {
//        return coin;
//    }
}
