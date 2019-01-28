package OOP_Test;

import OOP_Test.HW.Car;
import OOP_Test.HW.Point;
import OOP_Test.encapsulation.Bancomat;

public class main {
    public static void main(String[] args) {
        //Time time=new Time(12,25,36);
        //time.printTime();
        //Car car=new Car(10,0);
        //car.getInfo();
        //car.toLockIn(20);
       // car.getInfo();
        //car.toLockIn(20);
        //car.getInfo();
        //car.run(200);
       // car.getInfo();

        Bancomat bancomat=new Bancomat(10,10,10);
        bancomat.setMoney10(1000);
        bancomat.setMoney50(100);
        bancomat.getIhformation();
        bancomat.takeMoney(100);
        bancomat.getIhformation();



    }
}
