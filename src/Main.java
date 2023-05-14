import Products.Product;
import Users.User;

public class Main {
    public static void main(String[] args) {
        User customer1 = new User("admin", "admin@google.com", "admin123");


        Product lamp = new Product("Lamp", 15, 30);
        Product chair = new Product("Chair", 25, 50);


        customer1.getUserCart().addToCart(lamp, 4);
        customer1.getUserCart().addToCart(chair, 3);
        customer1.getUserCart().addToCart(chair, 2);
        customer1.getUserCart().printProducts();
    }
}