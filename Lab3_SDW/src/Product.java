public class Product {
    private String registrationNumber;
    private String name;
    private String model;
    private int quantity;
    private String manufacturer;
    private double price;
    private String manufactureDate;

    public Product(String registrationNumber, String name, String model,
                   int quantity, String manufacturer, double price, String manufactureDate) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.model = model;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.printf("%-10s %-15s %-10s %-10d %-15s %-10.2f %-12s\n",
                registrationNumber, name, model, quantity, manufacturer, price, manufactureDate);
    }
}
