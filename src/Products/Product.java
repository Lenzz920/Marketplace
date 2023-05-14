package Products;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<Product> products = new ArrayList<>();
    final private int id;
    private static int idUnique = 0;
    final private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.id = idUnique++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "The name of this product is: " + name +
                ". The id of this product is: " + id +
                ". The price of this product is: " + price +
                ". The available quantity is: " + quantity + ".";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void discount10() {
        double newPrice = this.price * 0.90;
        this.price = newPrice;
    }

}
