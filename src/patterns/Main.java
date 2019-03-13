package patterns;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");


        AnimalManeger animalManeger = new AnimalManeger(Arrays.asList(cat,dog));
        animalManeger.doOnEach(new ToVoteCommand());
        animalManeger.doOnEach(new ToLieCommand());
        animalManeger.doOnEach(new ToSitCommand());

    }
}
