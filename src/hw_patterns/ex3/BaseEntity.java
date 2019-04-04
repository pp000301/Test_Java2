package hw_patterns.ex3;

public abstract class BaseEntity {
    Trainer trainer;

    public BaseEntity(Trainer trainer) {
        this.trainer = trainer;
    }

    abstract void showDetals();

}
