package Orders;

import Carts.Cart;
import Users.User;

public class Order {

    final private User user;
    final private Cart cart;
    final private int orderId;
    private static int orderIdUnique = 0;

    public Order(User user, Cart cart) {
        this.user = user;
        this.cart = cart;
        this.orderId = orderIdUnique++;
    }

    @Override
    public String toString(){
        return "Order with id: " + orderId +
                ", was made by User: " + user +
                ", and the cart contains: " + cart;
    }

}
