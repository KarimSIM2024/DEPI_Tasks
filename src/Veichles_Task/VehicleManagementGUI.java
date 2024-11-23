package Veichles_Task;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VehicleManagementGUI extends JFrame {
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private final JTextArea textArea;
    private final JTextField makeField, modelField, yearField, priceField, mileageField;

    public VehicleManagementGUI() {
        setTitle("Vehicle Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        makeField = new JTextField();
        modelField = new JTextField();
        yearField = new JTextField();
        priceField = new JTextField();
        mileageField = new JTextField();

        inputPanel.add(new JLabel("Make:"));
        inputPanel.add(makeField);
        inputPanel.add(new JLabel("Model:"));
        inputPanel.add(modelField);
        inputPanel.add(new JLabel("Year:"));
        inputPanel.add(yearField);
        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceField);
        inputPanel.add(new JLabel("Mileage:"));
        inputPanel.add(mileageField);

        add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("Add Vehicle");
        addButton.addActionListener(e -> addVehicle());
        buttonPanel.add(addButton);

        JButton viewButton = new JButton("View Vehicles");
        viewButton.addActionListener(e -> viewVehicles());
        buttonPanel.add(viewButton);

        JButton modifyButton = new JButton("Modify Vehicle");
        modifyButton.addActionListener(e -> modifyVehicle());
        buttonPanel.add(modifyButton);

        JButton analyzeButton = new JButton("Perform Analysis");
        analyzeButton.addActionListener(e -> performAnalysis());
        buttonPanel.add(analyzeButton);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        buttonPanel.add(exitButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addVehicle() {
        String make = makeField.getText();
        String model = modelField.getText();
        int year = Integer.parseInt(yearField.getText());
        double price = Double.parseDouble(priceField.getText());
        double mileage = Double.parseDouble(mileageField.getText());

        Vehicle vehicle = new Vehicle(make, model, year, price, mileage);
        vehicles.add(vehicle);
        textArea.append("Vehicle added: " + vehicle + "\n");

        clearInputFields();
    }

    private void viewVehicles() {
        textArea.setText("List of all vehicles:\n");
        if (vehicles.isEmpty()) {
            textArea.append("No vehicles available.\n");
        } else {
            for (int i = 0; i < vehicles.size(); i++) {
                textArea.append((i + 1) + ". " + vehicles.get(i) + "\n");
            }
        }
    }

    private void modifyVehicle() {
        String indexStr = JOptionPane.showInputDialog(this, "Enter the number of the vehicle to modify:");
        int index = Integer.parseInt(indexStr) - 1;

        if (index >= 0 && index < vehicles.size()) {
            Vehicle vehicle = vehicles.get(index);
            String newMake = JOptionPane.showInputDialog(this, "Make (" + vehicle.make + "):", vehicle.make);
            String newModel = JOptionPane.showInputDialog(this, "Model (" + vehicle.model + "):", vehicle.model);
            String newYear = JOptionPane.showInputDialog(this, "Year (" + vehicle.year + "):", vehicle.year);
            String newPrice = JOptionPane.showInputDialog(this, "Price (" + vehicle.price + "):", vehicle.price);
            String newMileage = JOptionPane.showInputDialog(this, "Mileage (" + vehicle.mileage + "):", vehicle.mileage);

            if (newMake != null && !newMake.isEmpty()) vehicle.make = newMake;
            if (newModel != null && !newModel.isEmpty()) vehicle.model = newModel;
            if (newYear != null && !newYear.isEmpty()) vehicle.year = Integer.parseInt(newYear);
            if (newPrice != null && !newPrice.isEmpty()) vehicle.price = Double.parseDouble(newPrice);
            if (newMileage != null && !newMileage.isEmpty()) vehicle.mileage = Double.parseDouble(newMileage);

            textArea.append("Vehicle updated: " + vehicle + "\n");
        } else {
            textArea.append("Invalid vehicle number.\n");
        }
    }

    private void performAnalysis() {
        String[] options = {
                "Find vehicle with lowest mileage",
                "Count vehicles manufactured after 2020",
                "Calculate average price of all vehicles",
                "Find vehicle with highest price",
                "Display vehicles priced below $20,000",
                "Sort vehicles by year in ascending order",
                "Display all vehicles of make 'Toyota'",
                "Calculate total mileage of all vehicles",
                "Calculate average year of manufacture",
                "Display make and model of oldest vehicle",
                "Display vehicles with mileage above 20,000",
                "Check if any vehicle is manufactured in 2021",
                "Display make and model of vehicles in reverse order",
                "Display vehicle(s) with longest mileage"
        };

        String choice = (String) JOptionPane.showInputDialog(this, "Choose an analysis option:", "Analysis", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice != null) {
            switch (choice) {
                case "Find vehicle with lowest mileage" -> findLowestMileage();
                case "Count vehicles manufactured after 2020" -> countVehiclesAfter2020();
                case "Calculate average price of all vehicles" -> calculateAveragePrice();
                case "Find vehicle with highest price" -> findHighestPrice();
                case "Display vehicles priced below $20,000" -> displayVehiclesUnder20000();
                case "Sort vehicles by year in ascending order" -> sortVehiclesByYear();
                case "Display all vehicles of make 'Toyota'" -> displayToyotaVehicles();
                case "Calculate total mileage of all vehicles" -> calculateTotalMileage();
                case "Calculate average year of manufacture" -> calculateAverageYear();
                case "Display make and model of oldest vehicle" -> displayOldestVehicle();
                case "Display vehicles with mileage above 20,000" -> displayVehiclesWithHighMileage();
                case "Check if any vehicle is manufactured in 2021" -> checkVehiclesFrom2021();
                case "Display make and model of vehicles in reverse order" -> displayVehiclesInReverseOrder();
                case "Display vehicle(s) with longest mileage" -> displayVehiclesWithLongestMileage();
            }
        }
    }

    private void findLowestMileage() {
        if (vehicles.isEmpty()) {
            textArea.append("No vehicles available.\n");
            return;
        }
        Vehicle minMileageVehicle = vehicles.get(0);
        for (Vehicle v : vehicles) {
            if (v.mileage < minMileageVehicle.mileage) {
                minMileageVehicle = v;
            }
        }
        textArea.append("Vehicle with the lowest mileage: " + minMileageVehicle + "\n");
    }

    private void countVehiclesAfter2020() {
        long count = vehicles.stream().filter(v -> v.year > 2020).count();
        textArea.append("Number of vehicles manufactured after 2020: " + count + "\n");
    }

    private void calculateAveragePrice() {
        if (vehicles.isEmpty()) {
            textArea.append("No vehicles available.\n");
            return;
        }
        double totalPrice = vehicles.stream().mapToDouble(v -> v.price).sum();
        double avgPrice = totalPrice / vehicles.size();
        textArea.append("Average price of all vehicles: $" + avgPrice + "\n");
    }

    private void findHighestPrice() {
        if (vehicles.isEmpty()) {
            textArea.append("No vehicles available.\n");
            return;
        }
        Vehicle maxPriceVehicle = vehicles.get(0);
        for (Vehicle v : vehicles) {
            if (v.price > maxPriceVehicle.price) {
                maxPriceVehicle = v;
            }
        }
        textArea.append("Vehicle with the highest price: " + maxPriceVehicle + "\n");
    }

    private void displayVehiclesUnder20000() {
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.price < 20000) {
                textArea.append(v + "\n");
                found = true;
            }
        }
        if (!found) textArea.append("No vehicles priced below $20,000.\n");
    }

    private void sortVehiclesByYear() {
        vehicles.sort((v1, v2) -> Integer.compare(v1.year, v2.year));
        textArea.append("Vehicles sorted by year:\n");
        viewVehicles();
    }

    private void displayToyotaVehicles() {
        textArea.append("Toyota vehicles:\n");
        vehicles.stream()
                .filter(v -> "Toyota".equalsIgnoreCase(v.make))
                .forEach(v -> textArea.append(v + "\n"));
    }

    private void calculateTotalMileage() {
        double totalMileage = vehicles.stream().mapToDouble(v -> v.mileage).sum();
        textArea.append("Total mileage of all vehicles: " + totalMileage + "\n");
    }

    private void calculateAverageYear() {
        double averageYear = vehicles.stream().mapToInt(v -> v.year).average().orElse(0);
        textArea.append("Average year of manufacture: " + averageYear + "\n");
    }

    private void displayOldestVehicle() {
        Vehicle oldestVehicle = vehicles.stream()
                .min((v1, v2) -> Integer.compare(v1.year, v2.year))
                .orElse(null);
        if (oldestVehicle != null) {
            textArea.append("Oldest vehicle: " + oldestVehicle.make + " " + oldestVehicle.model + "\n");
        } else {
            textArea.append("No vehicles available.\n");
        }
    }

    private void displayVehiclesWithHighMileage() {
        textArea.append("Vehicles with mileage above 20,000:\n");
        vehicles.stream()
                .filter(v -> v.mileage > 20000)
                .forEach(v -> textArea.append(v + "\n"));
    }

    private void checkVehiclesFrom2021() {
        boolean has2021 = vehicles.stream().anyMatch(v -> v.year == 2021);
        textArea.append(has2021 ? "There is a vehicle manufactured in 2021.\n"
                : "No vehicles manufactured in 2021.\n");
    }

    private void displayVehiclesInReverseOrder() {
        textArea.append("Vehicles in reverse order:\n");
        for (int i = vehicles.size() - 1; i >= 0; i--) {
            textArea.append(vehicles.get(i) + "\n");
        }
    }

    private void displayVehiclesWithLongestMileage() {
        double maxMileage = vehicles.stream().mapToDouble(v -> v.mileage).max().orElse(0);
        textArea.append("Vehicle(s) with the longest mileage:\n");
        vehicles.stream()
                .filter(v -> v.mileage == maxMileage)
                .forEach(v -> textArea.append(v + "\n"));
    }

    private void clearInputFields() {
        makeField.setText("");
        modelField.setText("");
        yearField.setText("");
        priceField.setText("");
        mileageField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VehicleManagementGUI gui = new VehicleManagementGUI();
            gui.setVisible(true);
        });
    }
}