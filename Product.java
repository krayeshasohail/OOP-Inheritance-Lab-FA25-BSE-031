public class Product {
    private String productId;
    private String name;
    private double cost;
    
    public Product(String productId, String name, double cost) {
        this.productId = productId;
        this.name = name;
        this.cost = cost;
    }
    
    public void displayInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + cost);
    }
    
    public double calculateDiscount() {
        return cost * 0.05;
    }
    
    public double finalPrice() {
        return cost - calculateDiscount();
    }
    
    public String getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCost() {
        return cost;
    }
    
    @Override
    public String toString() {
        return "Product[ID=" + productId + ", Name=" + name + ", Cost=$" + cost + "]";
    }
}