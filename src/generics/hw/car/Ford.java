package generics.hw.car;


public class Ford extends Car{

    public Ford(String model, String year_of_issue, String carcase, String color, String weight) {
        super(model, year_of_issue, carcase, color, weight);
    }

    @Override
    public String toString() {
        return "Ford{" +
                "model='" + model + '\'' +
                ", year_of_issue='" + year_of_issue + '\'' +
                ", carcase='" + carcase + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
