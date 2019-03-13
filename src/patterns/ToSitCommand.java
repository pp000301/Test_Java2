package patterns;

public class ToSitCommand implements Command{

    @Override
    public void execute(Animal animal) {
        animal.sit();
    }
}
