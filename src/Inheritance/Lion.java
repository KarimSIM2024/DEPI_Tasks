package Inheritance;

class Lion extends Animal {
    // Additional attribute specific to Lion
    String maneColor;

    // Constructor for the Lion class
    public Lion(String name, int age, String habitat, String maneColor) {
        super(name, age, habitat); // Using super to call the parent constructor
        this.maneColor = maneColor;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the parent method
        System.out.println("Mane Color: " + maneColor);
    }
}
