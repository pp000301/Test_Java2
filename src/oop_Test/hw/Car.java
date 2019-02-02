/*Реализуйте класс Саг, моделирующий передвижение автомобиля на бензино­ вом топливе по оси х.
Предоставьте методы для передвижения автомобиля на заданное количество километров, заполнения топливного бака
заданным ко­ личеством литров бензина, вычисления расстояния, пройденного от начала координат, а также уровня
 топлива в баке. Укажите расход топлива (в км/ч) в качестве параметра конструктора данного класса.*/

package oop_Test.hw;

public class Car {
    private double rashod;
    private double fuelLevel;
    private double position = 0;

    public Car(double rashod, double fuelLevel) {
        this.rashod = rashod;
        this.fuelLevel = fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel += fuelLevel;
    }


    public Car run(double kilomtres) {
        Car run = new Car(this.rashod, this.fuelLevel -= (kilomtres / 100) * this.rashod);
        position += kilomtres;
        return run;
    }

    public void getInfo() {
        System.out.println("уровень топлива в баке: " + this.fuelLevel + "\nТтекущая позиция:" + position + "км");
        System.out.println("Машина может проехать без заправки:" + ((this.fuelLevel / this.rashod) * 100) + " км");
    }

}
