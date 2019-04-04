package hw_patterns.ex1;

import java.util.List;

public class Users implements BaseEntity {

    private String name;
    private Integer age;
    private Animal pet;



    @Override
    public BaseEntity lie() {
        System.out.println("User "+ name+" age"+ age+" whith pet"+pet+"is lie");
        return null;
    }

    @Override
    public void voice() {
        System.out.println("User "+ name+" age"+ age+" whith pet"+pet+"is lie");
    }
}
