import at.fhtw.lap.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal ant = new Ant("earth", 1, "w", "anthill", 0, "worker", "fire ant");
        Animal bat = new Bat("air", 12, "m", 15, "darkgray", 17.3f, 8.3f);
        Animal dog = new Dog("earth", 7, "m", 38.3f, "black", true, 12.8f, "Labrador", "Maria Huber");
        Animal dolphin = new Dolphin("water", 25, "w", 36.6f, "black/white", 3.8f, 12.8f, 4.1f, "cone-shaped");
        Animal drosMel = new DrosophiliaMelanogaster("air", 0, "w", "forest", 2, "black", "red");
        Animal kangaroo = new Kangaroo("earth", 9, "w", 36.1f, "brown", 11.6f, 3.8f);
        Animal kiwi = new Kiwi("air", 30, "w", 0.5f, 2, 15.0f, "Okarito Kiwi");
        Animal lion = new Lion("earth", 12, "m", 37.5f, "lightbrown", true, false, 15, "brown");
        Animal owl = new Owl("air", 5, "w", 1.2f, 4, "yellow", "heart-shaped");
        Animal platypus = new Platypus("earth/water", 8, "w", 32.0f, "brown", 2, 4.8f);
        Animal wolf = new Wolf("earth", 5, "w", 36.2f, "white", false, 3.7f, 6, "Polarwolf");

        animals.add(ant);
        animals.add(bat);
        animals.add(dog);
        animals.add(dolphin);
        animals.add(drosMel);
        animals.add(kangaroo);
        animals.add(kiwi);
        animals.add(lion);
        animals.add(owl);
        animals.add(platypus);
        animals.add(wolf);

        for (Animal animal : animals){
            System.out.println(animal);
            animal.getAnimalSound();
            System.out.printf("\n");
        }
    }
}
