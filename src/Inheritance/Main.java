package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Creating an Animal reference for a Lion object
        Animal animal = new Lion("Leo", 5, "Savannah", "Golden");

        // Checking instance type
        if (animal instanceof Lion) {
            System.out.println("This animal is a Lion.");
        }

        // Displaying information using overridden method
        animal.displayInfo();
    }
}
