public class VendingMachine {

    private double coin;
    private String products;

    public VendingMachine(String products, double coin) {
        this.products = products;
        this.coin = coin;
    }

    public String getProduct() {
        return this.products;
    }


//    public double getCoin() {
//        return coin;
//    }
}
