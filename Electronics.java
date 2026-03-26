public class Electronics extends Product {
    private String company;
    private int warranty;
    
    public Electronics(String productId, String name, double cost, String company, int warranty) {
        super(productId, name, cost);
        this.company = company;
        this.warranty = warranty;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + company);
        System.out.println("Warranty: " + warranty + " months");
    }
    
    @Override
    public double calculateDiscount() {
        return getCost() * 0.10;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Electronics[Brand=" + company + ", Warranty=" + warranty + " months]";
    }
    
    public String getCompany() {
        return company;
    }
    
    public int getWarranty() {
        return warranty;
    }
}