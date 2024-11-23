package Veichle.system;

class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String make, String model, int year, int engineCapacity) {
        super(make, model, year);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}
