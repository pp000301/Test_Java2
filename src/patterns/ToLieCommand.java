package patterns;

public class ToLieCommand implements Command {

    @Override
    public void execute(Animal animal) {
        animal.toLie();
    }
}
