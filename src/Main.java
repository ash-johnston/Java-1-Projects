public class Main {
    private static final String STORE_NAME = "My awesome store!";
    public static void main(String[] args) {
        String productName = "Laptop";
        int id = 8753874;
        double price = 3199.99;
        int available = 35;
        System.out.println(STORE_NAME);
        System.out.println("\nProduct Information:");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + id);
        System.out.println("Product Price: $" + price);
        System.out.println("Quantity Available: " + available);
    }
}