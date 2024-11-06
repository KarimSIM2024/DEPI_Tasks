import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManager {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        manager.run();
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("\nVehicle Management System");
            System.out.println("1. Add a vehicle");
            System.out.println("2. View all vehicles");
            System.out.println("3. Modify a vehicle");
            System.out.println("4. Perform analysis");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> viewVehicles();
                case 3 -> modifyVehicle();
                case 4 -> performAnalysis();
                case 5 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private void addVehicle() {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter mileage: ");
        double mileage = scanner.nextDouble();
        scanner.nextLine();

        Vehicle vehicle = new Vehicle(make, model, year, price, mileage);
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully.");
    }

    private void viewVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            System.out.println("\nList of all vehicles:");
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.println((i + 1) + ". " + vehicles.get(i));
            }
        }
    }

    private void modifyVehicle() {
        viewVehicles();
        if (vehicles.isEmpty()) return;

        System.out.print("\nEnter the number of the vehicle you want to modify: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < vehicles.size()) {
            Vehicle vehicle = vehicles.get(index);

            System.out.println("Enter new details for the vehicle (leave blank to keep current value):");
            System.out.print("Make (" + vehicle.make + "): ");
            String make = scanner.nextLine();
            if (!make.isEmpty()) vehicle.make = make;

            System.out.print("Model (" + vehicle.model + "): ");
            String model = scanner.nextLine();
            if (!model.isEmpty()) vehicle.model = model;

            System.out.print("Year (" + vehicle.year + "): ");
            String yearInput = scanner.nextLine();
            if (!yearInput.isEmpty()) vehicle.year = Integer.parseInt(yearInput);

            System.out.print("Price (" + vehicle.price + "): ");
            String priceInput = scanner.nextLine();
            if (!priceInput.isEmpty()) vehicle.price = Double.parseDouble(priceInput);

            System.out.print("Mileage (" + vehicle.mileage + "): ");
            String mileageInput = scanner.nextLine();
            if (!mileageInput.isEmpty()) vehicle.mileage = Double.parseDouble(mileageInput);

            System.out.println("Vehicle updated successfully.");
        } else {
            System.out.println("Invalid vehicle number.");
        }
    }

    private void performAnalysis() {
        System.out.println("\nAnalysis Options:");
        System.out.println("1. Find vehicle with the lowest mileage");
        System.out.println("2. Count vehicles manufactured after 2020");
        System.out.println("3. Calculate average price of all vehicles");
        System.out.println("4. Find vehicle with the highest price");
        System.out.println("5. Display vehicles priced below $20,000");
        System.out.print("Choose an analysis option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> findLowestMileage();
            case 2 -> countVehiclesAfter2020();
            case 3 -> calculateAveragePrice();
            case 4 -> findHighestPrice();
            case 5 -> displayVehiclesUnder20000();
            default -> System.out.println("Invalid choice. Returning to main menu.");
        }
    }

    private void findLowestMileage() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        Vehicle minMileageVehicle = vehicles.get(0);
        for (Vehicle v : vehicles) {
            if (v.mileage < minMileageVehicle.mileage) {
                minMileageVehicle = v;
            }
        }
        System.out.println("Vehicle with the lowest mileage: " + minMileageVehicle);
    }

    private void countVehiclesAfter2020() {
        int count = 0;
        for (Vehicle v : vehicles) {
            if (v.year > 2020) count++;
        }
        System.out.println("Number of vehicles manufactured after 2020: " + count);
    }

    private void calculateAveragePrice() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        double totalPrice = 0;
        for (Vehicle v : vehicles) totalPrice += v.price;
        double avgPrice = totalPrice / vehicles.size();
        System.out.println("Average price of all vehicles: $" + avgPrice);
    }

    private void findHighestPrice() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        Vehicle maxPriceVehicle = vehicles.get(0);
        for (Vehicle v : vehicles) {
            if (v.price > maxPriceVehicle.price) maxPriceVehicle = v;
        }
        System.out.println("Vehicle with the highest price: " + maxPriceVehicle);
    }

    private void displayVehiclesUnder20000() {
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.price < 20000) {
                System.out.println(v);
                found = true;
            }
        }
        if (!found) System.out.println("No vehicles priced below $20,000.");
    }
}
