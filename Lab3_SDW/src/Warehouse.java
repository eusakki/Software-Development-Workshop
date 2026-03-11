public class Warehouse {
    public static void printHeader() {
        System.out.printf("%-10s %-15s %-10s %-10s %-15s %-10s %-12s\n",
                "RegNum", "Name", "Model", "Quantity", "Manufacturer", "Price", "Date");
    }

    public static void findByManufacturer(Product[] products, String manufacturer) {
        boolean found = false;

        printHeader();

        for (Product p : products) {
            if (p.getManufacturer().equalsIgnoreCase(manufacturer)) {
                p.print();
                found = true;
            }
        }

        if (!found) {
            System.out.println("This manufacturer's product not found.");
        }
    }

    public static void findProductInfo(Product[] products, String name) {
        boolean found = false;

        System.out.printf("%-15s %-10s %-10s\n", "Manufacturer", "Price", "Quantity");

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.printf("%-15s %-10.2f %-10d\n",
                        p.getManufacturer(), p.getPrice(), p.getQuantity());

                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }
}
