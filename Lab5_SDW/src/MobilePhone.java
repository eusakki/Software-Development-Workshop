import java.util.ArrayList;

public class MobilePhone implements Searchable {
    private String model;
    private ArrayList<Component> components;

    public MobilePhone(String model) {
        this.model = model;
        this.components = new ArrayList();
    }

    public void addComponent(String name, String purpose, String property) {
        this.components.add(new Component(name, purpose, property));
    }

    public void printPhone() {
        System.out.println("\nPhone model: " + this.model);
        System.out.println("Components:");

        for(Component c : this.components) {
            c.print();
        }

    }

    public void searchComponent(String name) {
        boolean found = false;

        for(Component c : this.components) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println("\nComponent found:");
                c.print();
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nComponent not found");
        }

    }

    class Component {
        private String name;
        private String purpose;
        private String property;

        public Component(String name, String purpose, String property) {
            this.name = name;
            this.purpose = purpose;
            this.property = property;
        }

        public void print() {
            System.out.println("Name: " + this.name + " | Purpose: " + this.purpose + " | Property: " + this.property);
        }
    }
}
