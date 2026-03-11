import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 5;
        Product[] products = new Product[size];

        System.out.println("Enter product details:");

        for (int i = 0; i < size; i++) {
            System.out.println("\nProduct " + (i + 1));

            try {
                System.out.print("Registration number: ");
                String reg = sc.next();

                System.out.print("Product name: ");
                String name = sc.next();

                System.out.print("Model: ");
                String model = sc.next();

                System.out.print("Quantity: ");
                int quantity = sc.nextInt();

                System.out.print("Manufacturer: ");
                String manufacturer = sc.next();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Date of manufacture: ");
                String date = sc.next();

                products[i] = new Product(reg, name, model, quantity, manufacturer, price, date);
            } catch (Exception e) {
                System.out.println("Input error! Please enter the data again.");
                sc.nextLine();
                i--;
            }
        }

        System.out.println("\nList of products: ");

        Warehouse.printHeader();

        for (Product p : products) {
            p.print();
        }

        System.out.print("\nEnter manufacturer to search: ");
        String manufacturer = sc.next();

        Warehouse.findByManufacturer(products, manufacturer);

        System.out.print("\nEnter product's name to search: ");
        String productName = sc.next();

        Warehouse.findProductInfo(products, productName);

        sc.close();
    }
}