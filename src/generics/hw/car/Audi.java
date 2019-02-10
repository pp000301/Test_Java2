package generics.hw.car;

public class Audi extends  Car{

    public Audi(String model, String year_of_issue, String carcase, String color, String weight) {
        super(model, year_of_issue, carcase, color, weight);
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                ", year_of_issue='" + year_of_issue + '\'' +
                ", carcase='" + carcase + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
