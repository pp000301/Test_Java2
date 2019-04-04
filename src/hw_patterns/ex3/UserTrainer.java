package hw_patterns.ex3;

public class UserTrainer  implements Trainer{


    @Override
    public void lie() {
        System.out.println("lie UserTrainer");
    }

    @Override
    public void voice() {
        System.out.println("voice UserTrainer");
    }
}
