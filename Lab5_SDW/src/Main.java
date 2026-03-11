import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone model: ");
        String model = sc.nextLine();

        MobilePhone phone = new MobilePhone(model);

        System.out.print("How much components to add?: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nComponent " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Purpose: ");
            String purpose = sc.nextLine();

            System.out.print("Property: ");
            String property = sc.nextLine();

            phone.addComponent(name, purpose, property);
        }

        phone.printPhone();

        System.out.print("\nEnter component name to search: ");
        String search = sc.nextLine();

        phone.searchComponent(search);

        sc.close();
    }
}
