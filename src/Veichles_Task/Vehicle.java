package Veichles_Task;

public class Vehicle {
    String make;
    String model;
    int year;
    double price;
    double mileage;

    public Vehicle(String make, String model, int year, double price, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ") - Price: $" + price + ", Mileage: " + mileage + " miles";
    }
}
