package patterns;

public class ToVoteCommand implements Command {


    @Override
    public void execute(Animal animal) {
        animal.vote();
    }
}
