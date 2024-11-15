package Animal_Task;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        Animal animal2 = new Animal("Lion");

        Animal animal3 = new Animal("Elephant", 5000.0);

        Animal animal4 = new Animal("Dog", 25.0, "Brown", 4, 2, 2, "Bark");

        animal4.setAttributes("Cat");
        animal4.setAttributes("Cat", 10.0);
        animal4.setAttributes("Cat", 10.0, "White");
        animal4.setAttributes("Cat", 10.0, "White", 4, 2, 2, "Meow");
    }
}

