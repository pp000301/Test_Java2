package generics.hw.car;

abstract public class Car {
    String model,year_of_issue,carcase,color,weight;

    public Car(String model, String year_of_issue, String carcase, String color, String weight) {
        this.model = model;
        this.year_of_issue = year_of_issue;
        this.carcase = carcase;
        this.color = color;
        this.weight = weight;
    }
}
