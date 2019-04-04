package hw_patterns.ex3;

public class AnimalTrainer implements Trainer {

    @Override
    public void lie() {
        System.out.println("lie AnimalTrainer");
    }

    @Override
    public void voice() {
        System.out.println("voice AnimalTrainer");
    }
}
