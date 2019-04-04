package hw_patterns.ex3;

public class TestBridge {
    public static void main(String[] args) {
        BaseEntity baseEntity=new User(new UserTrainer());
        baseEntity.showDetals();
        BaseEntity baseEntity1=new Animals(new AnimalTrainer());
        baseEntity1.showDetals();
    }
}
