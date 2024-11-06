package Veichles_Task;

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

    public void performAnalysis() {
        System.out.println("\nChoose an analysis option:");
        System.out.println("1. Find vehicle with lowest mileage");
        System.out.println("2. Count vehicles manufactured after 2020");
        System.out.println("3. Calculate average price of all vehicles");
        System.out.println("4. Find vehicle with highest price");
        System.out.println("5. Display vehicles priced below $20,000");
        System.out.println("6. Sort vehicles by year in ascending order");
        System.out.println("7. Display all vehicles of make 'Toyota'");
        System.out.println("8. Calculate total mileage of all vehicles");
        System.out.println("9. Calculate average year of manufacture");
        System.out.println("10. Display make and model of oldest vehicle");
        System.out.println("11. Display vehicles with mileage above 20,000");
        System.out.println("12. Check if any vehicle is manufactured in 2021");
        System.out.println("13. Display make and model of vehicles in reverse order");
        System.out.println("14. Display vehicle(s) with longest mileage");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> findLowestMileage();
            case 2 -> countVehiclesAfter2020();
            case 3 -> calculateAveragePrice();
            case 4 -> findHighestPrice();
            case 5 -> displayVehiclesUnder20000();
            case 6 -> sortVehiclesByYear();
            case 7 -> displayToyotaVehicles();
            case 8 -> calculateTotalMileage();
            case 9 -> calculateAverageYear();
            case 10 -> displayOldestVehicle();
            case 11 -> displayVehiclesWithHighMileage();
            case 12 -> checkVehiclesFrom2021();
            case 13 -> displayVehiclesInReverseOrder();
            case 14 -> displayVehiclesWithLongestMileage();
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

    public void sortVehiclesByYear() {
        vehicles.sort((v1, v2) -> Integer.compare(v1.year, v2.year));
        System.out.println("Vehicles sorted by year:");
        viewVehicles();
    }

    public void displayToyotaVehicles() {
        System.out.println("Toyota vehicles:");
        vehicles.stream()
                .filter(v -> "Toyota".equalsIgnoreCase(v.make))
                .forEach(System.out::println);
    }

    public void calculateTotalMileage() {
        double totalMileage = vehicles.stream().mapToDouble(v -> v.mileage).sum();
        System.out.println("Total mileage of all vehicles: " + totalMileage);
    }

    public void calculateAverageYear() {
        double averageYear = vehicles.stream().mapToInt(v -> v.year).average().orElse(0);
        System.out.println("Average year of manufacture: " + averageYear);
    }

    public void displayOldestVehicle() {
        Vehicle oldestVehicle = vehicles.stream()
                .min((v1, v2) -> Integer.compare(v1.year, v2.year))
                .orElse(null);
        if (oldestVehicle != null) {
            System.out.println("Oldest vehicle: " + oldestVehicle.make + " " + oldestVehicle.model);
        }
    }

    public void displayVehiclesWithHighMileage() {
        System.out.println("Vehicles with mileage above 20,000:");
        vehicles.stream()
                .filter(v -> v.mileage > 20000)
                .forEach(System.out::println);
    }

    public void checkVehiclesFrom2021() {
        boolean has2021 = vehicles.stream().anyMatch(v -> v.year == 2021);
        System.out.println(has2021 ? "There is a vehicle manufactured in 2021."
                : "No vehicles manufactured in 2021.");
    }

    public void displayVehiclesInReverseOrder() {
        System.out.println("Vehicles in reverse order:");
        for (int i = vehicles.size() - 1; i >= 0; i--) {
            System.out.println(vehicles.get(i));
        }
    }

    public void displayVehiclesWithLongestMileage() {
        double maxMileage = vehicles.stream().mapToDouble(v -> v.mileage).max().orElse(0);
        System.out.println("Vehicle(s) with the longest mileage:");
        vehicles.stream()
                .filter(v -> v.mileage == maxMileage)
                .forEach(System.out::println);
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
