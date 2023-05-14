package Products;

public abstract class Product {
    final private int productId;
    private static int productIdUnique = 0;
    final private String name;
    private double price;
    private int quantity;


    public Product(String name, double price, int quantity) {
        this.productId = productIdUnique++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "The name of this product is: " + name +
                ". The id of this product is: " + productId +
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
        this.price = this.price * 0.90;
    }
}
