public class Smartphone extends Electronics {
    private int storage;
    private int cameraResolution;
    private int battery;
    
    public Smartphone(String productId, String name, double cost, String company, int warranty, int storage, int cameraResolution, int battery) {
        super(productId, name, cost, company, warranty);
        this.storage = storage;
        this.cameraResolution = cameraResolution;
        this.battery = battery;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Camera: " + cameraResolution + "MP");
        System.out.println("Battery: " + battery + "mAh");
    }
    
    @Override
    public double calculateDiscount() {
        return getCost() * 0.15;
    }
    
    public void showSpecs() {
        System.out.println("=== Smartphone Specifications ===");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Camera: " + cameraResolution + "MP");
        System.out.println("Battery: " + battery + "mAh");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Smartphone[Storage=" + storage + "GB, Camera=" + cameraResolution + "MP, Battery=" + battery + "mAh]";
    }
    
    public int getStorage() {
        return storage;
    }
    
    public int getCameraResolution() {
        return cameraResolution;
    }
    
    public int getBattery() {
        return battery;
    }
}