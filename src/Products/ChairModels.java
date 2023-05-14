package Products;

public enum ChairModels {
    MODEL_A("Model A",  99.99),
    MODEL_B("Model B",  149.99),
    MODEL_C("Model C",  199.99);

    private final String name;
    private final double price;

    ChairModels(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
