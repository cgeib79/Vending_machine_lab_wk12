package products;

import products.Product;
import products.Sweet;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> products;

    private double price;
//    Sweet sweet;



    public VendingMachine(double price, Sweet sweet) {
        this.products = new ArrayList<>();
        this.price = price;
//        this.sweet = sweet;
    }

    public ArrayList<Product> getProduct() {
        return this.products;
    }

    public double getPrice() {
        return this.price;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }


    public int getProductCount() {
        return this.products.size();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    //    public double getCoin() {
//        return coin;
//    }
}
