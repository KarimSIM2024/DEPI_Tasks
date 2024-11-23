package Multiple_Inheritance_in_Appliances;

class WashingMachine implements ElectricAppliance, WarrantyProvider {
    public void turnOn() {
        System.out.println("Washing machine turned on");
    }

    public void provideWarranty() {
        System.out.println("2-year warranty provided");
    }
}
