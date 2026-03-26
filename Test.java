public class Test {
    public static void main(String[] args) {
        Product p = new Product("PRD999", "Wireless Headphones", 79.99);
        Electronics e = new Electronics("MAC2024", "MacBook Air M3", 1099.99, "Apple", 12);
        Smartphone s = new Smartphone("IPH512", "iPhone 15 Pro Max", 1599.99, "Apple", 12, 512, 48, 4441);
        
        System.out.println("--- Product ---");
        p.displayInfo();
        System.out.println("Discount: $" + p.calculateDiscount());
        System.out.println("Final: $" + p.finalPrice());
        
        System.out.println("\n--- Electronics ---");
        e.displayInfo();
        System.out.println("Discount: $" + e.calculateDiscount());
        System.out.println("Final: $" + e.finalPrice());
        
        System.out.println("\n--- Smartphone ---");
        s.displayInfo();
        System.out.println("Discount: $" + s.calculateDiscount());
        System.out.println("Final: $" + s.finalPrice());
        
        System.out.println("\n--- Smartphone Features ---");
        s.showSpecs();
    }
}