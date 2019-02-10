package generics.hw.car;


public class BMW extends Car{

    public BMW(String model, String year_of_issue, String carcase, String color, String weight) {
        super(model, year_of_issue, carcase, color, weight);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                ", year_of_issue='" + year_of_issue + '\'' +
                ", carcase='" + carcase + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
