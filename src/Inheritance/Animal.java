package Inheritance;

class Animal {
    // Attributes of the Animal class
    String name;
    int age;
    String habitat;

    // Constructor for the Animal class
    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    // Method to display basic information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Habitat: " + habitat);
    }
}
