import Products.Chair;
import Products.Lamps;
import Products.Product;
import Products.Tables;
import Users.User;

public class Main {
    public static void main(String[] args) {
        User customer1 = new User("admin", "admin@google.com", "admin123");

        Product chair1 = new Chair("ChairA", 20, 50);
        Product chair2 = new Chair("ChairB", 30, 50);
        Product chair3 = new Chair("ChairC", 40, 50);
        Product lamp1 = new Lamps("LampA", 50, 50);
        Product lamp2 = new Lamps("LampB", 60, 50);
        Product lamp3 = new Lamps("LampC", 70, 50);
        Product table1 = new Tables("TableA", 80, 50);
        Product table2 = new Tables("TableB", 90, 50);
        Product table3 = new Tables("TableC", 100, 50);

        customer1.logIn("admin", "admin123");

        customer1.getUserCart().addToCart(chair3,5);
        customer1.getUserCart().addToCart(lamp3,5);
        customer1.getUserCart().addToCart(table3,15);

        customer1.getUserCart().printProducts();

    }
}