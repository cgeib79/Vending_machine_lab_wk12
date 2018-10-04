package products;

import java.util.ArrayList;

public class Stock {

    private ArrayList<Product> products;
    private double price;
    private int capacity;



    public Stock(double price, int capacity) {
        this.products = new ArrayList<>();
        this.price = price;
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }



    public int getStockLevel() {
        return products.size();
    }


    public void addProduct(Sweet sweet) {
       this.products.add(sweet);
    }

    public void removeProduct(Sweet sweet) {
        this.products.remove(sweet);
    }
}
