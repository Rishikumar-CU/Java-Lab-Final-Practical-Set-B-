import java.util.Scanner;

public class Main {
    private static ProductService service = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Product CRUD Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> service.listProducts();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
                case 5 -> { System.out.println("👋 Goodbye!"); return; }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(0, name, price, qty);
        service.addProduct(product);
    }

    private static void updateProduct() {
        System.out.print("Enter product ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter new quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(id, name, price, qty);
        service.updateProduct(product);
    }

    private static void deleteProduct() {
        System.out.print("Enter product ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        service.deleteProduct(id);
    }
}
