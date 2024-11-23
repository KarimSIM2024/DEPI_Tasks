package Veichle.system;

class Car extends Vehicle {
    private String fuelType;

    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}
