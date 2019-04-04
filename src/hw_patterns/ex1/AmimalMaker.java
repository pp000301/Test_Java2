package hw_patterns.ex1;

public class AmimalMaker implements FabricWatchMaker {
    @Override
    public Animal greateBaseEntity() {
        return new Animal();
    }
}
