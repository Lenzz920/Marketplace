package Carts;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    List<Product> cart = new ArrayList<>();
    private double totalPrice;
    final private static String productNotFound = "The specified product does not exist inside the cart";

    public void addToCart(Product product, int quantity) {
        cart.add(product);
        product.setQuantity(product.getQuantity() - quantity);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public void printProducts() {
        for (Product product : cart) {
            System.out.println(product);
        }
    }

    public double getCartPrice() {
        for (Product product : cart) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public String getProduct(String product1) {
        for (Product product : cart) {
            if (product.getName().equals(product1)){
                return product.toString();
            }
        } return productNotFound;
    }

    /* public void purchase() {
        Order order = new Order();
    } */
}
