package Animal_Task;

public class Animal {
    private String title;
    private double weight;
    private String color;
    private int legs;
    private int earsNum;
    private int eyesNum;
    private String sound;

    // Parameterless constructor
    public Animal() {
        this.title = "Unknown";
        this.weight = 0.0;
        this.color = "Unknown";
        this.legs = 0;
        this.earsNum = 0;
        this.eyesNum = 0;
        this.sound = "None";
        System.out.println("Parameterless constructor called.");
        printAttributes();
    }

    public Animal(String title) {
        this.title = title;
        System.out.println("Constructor with one parameter called: Title = " + title);
        printAttributes();
    }

    public Animal(String title, double weight) {
        this.title = title;
        this.weight = weight;
        System.out.println("Constructor with two parameters called: Title = " + title + ", Weight = " + weight);
        printAttributes();
    }

    public Animal(String title, double weight, String color, int legs, int earsNum, int eyesNum, String sound) {
        this.title = title;
        this.weight = weight;
        this.color = color;
        this.legs = legs;
        this.earsNum = earsNum;
        this.eyesNum = eyesNum;
        this.sound = sound;
        System.out.println("Constructor with all parameters called.");
        printAttributes();
    }

    public void setAttributes(String title) {
        this.title = title;
        System.out.println("Method setAttributes called with title: " + title);
    }

    public void setAttributes(String title, double weight) {
        this.title = title;
        this.weight = weight;
        System.out.println("Method setAttributes called with title: " + title + " and weight: " + weight);
    }

    public void setAttributes(String title, double weight, String color) {
        this.title = title;
        this.weight = weight;
        this.color = color;
        System.out.println("Method setAttributes called with title: " + title + ", weight: " + weight + " and color: " + color);
    }

    // Overloaded method to set full attributes
    public void setAttributes(String title, double weight, String color, int legs, int earsNum, int eyesNum, String sound) {
        this.title = title;
        this.weight = weight;
        this.color = color;
        this.legs = legs;
        this.earsNum = earsNum;
        this.eyesNum = eyesNum;
        this.sound = sound;
        System.out.println("Method setAttributes called with full parameters.");
        printAttributes();
    }

    // Method to print the attributes of the animal
    private void printAttributes() {
        System.out.println("Animal Details:");
        System.out.println("Title: " + title);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Legs: " + legs);
        System.out.println("Ears Number: " + earsNum);
        System.out.println("Eyes Number: " + eyesNum);
        System.out.println("Sound: " + sound);
        System.out.println();
    }
}

