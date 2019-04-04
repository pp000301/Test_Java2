package hw_patterns.ex3;

public class Animals extends BaseEntity {
    public Animals(Trainer trainer) {
        super(trainer);
    }

    @Override
    void showDetals() {
        trainer.lie();
        trainer.voice();
    }
}
