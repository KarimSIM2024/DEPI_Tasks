package Animal_Sound_Simulation;

import java.util.ArrayList;
import java.util.List;

public class MainAnimalSounds {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}