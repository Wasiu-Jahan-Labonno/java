class Product {
    public String name;
    public String id;
    public String category;
    public double price;

    public Product(String name, String id, String category, double price) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice(double discountPercentage) {
        double discountedPrice = price * (1 - discountPercentage / 100);
        return discountedPrice;
    }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + id);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

class UapBazar {
    public static void main(String[] args) {
        // Create an object of the Product class
        Product product = new Product("Smartphone", "12345", "Electronics", 500.0);

        // Assign values to attributes
        product.display();

        // Update the price
        product.updatePrice(450.0);

        // Display product information after price update
        System.out.println("Product information after price update:");
        product.display();

        // Get discounted price (20% discount)
        double discountPercentage = 20.0;
        double discountedPrice = product.getDiscountedPrice(discountPercentage);
        System.out.println("Discounted Price (" + discountPercentage + "%): " + discountedPrice);
    }
}
