import Carts.Cart;
import Products.Product;

public class Main {
    public static void main(String[] args) {
        Product lamp = new Product("Lamp", 15.99, 15);
        Product chair = new Product("Chair", 25.99, 25);
        Product table = new Product("Table", 45.99, 44);

        Cart cart1 = new Cart();

        cart1.addToCart(lamp);
        cart1.addToCart(chair);
        cart1.printProducts();
        cart1.addToCart(table);

        System.out.println("-----------------");
        lamp.discount10();
        cart1.printProducts();

        System.out.println("-----------------");
        System.out.println(cart1.getCartPrice());

        System.out.println("-----------------");
        System.out.println(cart1.getProduct("Table"));
    }
}