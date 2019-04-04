package hw_patterns.ex1;

public class Animal implements BaseEntity {
    private String nickname;
    private Type type;

    @Override
    public BaseEntity lie() {
        System.out.println("Animals "+ type+" "+ nickname+" is lie");
        return null;
    }

    @Override
    public void voice() {
        System.out.println("Animals "+ type+" "+ nickname+" is voice");
    }
}
