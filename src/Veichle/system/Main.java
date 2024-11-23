package Veichle.system;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2020, "Petrol");
        Vehicle bike = new Bike("bike", "M55", 2021, 5550);

        car.displayDetails();
        System.out.println();
        bike.displayDetails();
    }
}
