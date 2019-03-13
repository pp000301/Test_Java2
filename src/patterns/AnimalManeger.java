package patterns;

import java.util.List;

public class AnimalManeger {
    private final List<Animal> animals;

    public AnimalManeger(List<Animal> animals) {
        this.animals = animals;
    }
    public void doOnEach(Command command){
        for (Animal animal:animals) {
            command.execute(animal);
        }
    }
}
