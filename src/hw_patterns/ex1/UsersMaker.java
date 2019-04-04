package hw_patterns.ex1;

public class UsersMaker implements FabricWatchMaker {
    @Override

    public Animal greateBaseEntity() {
        return new Animal();
    }
}
