package hw_patterns.ex3;

public class User extends BaseEntity {
    public User(Trainer trainer) {
        super(trainer);
    }

    @Override
    void showDetals() {
        trainer.lie();
        trainer.voice();
    }
}
