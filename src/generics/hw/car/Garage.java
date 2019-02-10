package generics.hw.car;


import java.util.*;

public class Garage {

    public static void main(String[] args) {


        BMW bmw = new BMW("X5", "2012", "sedan", "Black", "2000");
        BMW bmw1 = new BMW("X6", "2012", "sedan", "Black", "2000");
        BMW bmw2 = new BMW("X7", "2012", "sedan", "Black", "2000");
        Audi audi = new Audi("Q4", "2012", "sedan", "Black", "2000");
        Audi audi1 = new Audi("Q7", "2012", "sedan", "Black", "2000");
        Ford ford = new Ford("Mondeo", "2012", "sedan", "Black", "2000");

        ArrayList parking = new ArrayList();// список всех машин на паркинге
        Map mapCar = new HashMap();//список количества машин по классам
        // Парковка машин на паркинге
        parking(bmw, parking, mapCar);
        parking(bmw1, parking, mapCar);
        parking(bmw2, parking, mapCar);
        parking(audi, parking, mapCar);
        parking(audi1, parking, mapCar);
        parking(ford, parking, mapCar);
        //  Удаление машины из
        unParking(ford, parking, mapCar);

        //System.out.println(parking);
        System.out.println(mapCar);

        getMap(bmw, parking, mapCar);// получение кол машин определенного класса
    }

    public static void parking(Object car, List list, Map map) {
        list.add(car);

        for (Object i : list) {
            int count = 0;
            for (Object k : list) {
                if (i.getClass().getSimpleName().equals(k.getClass().getSimpleName()))
                    count++;
            }
            map.put(i.getClass().getSimpleName(), count);
        }
    }


    public static void unParking(Object car, List list, Map map) {
        int index = list.indexOf(car);
        if (index != -1) {
            String name = list.get(index).getClass().getSimpleName();
            Object getCount = map.get(name);
            list.remove(index);
            Integer count = (Integer) getCount - 1;
            if (count == 0)
                map.remove(name);
            else
                map.put(name, count);
        }

    }

    public static void getMap(Object car, List list, Map map) {
        int index = list.indexOf(car);
        if (index != -1) {
            String name = list.get(index).getClass().getSimpleName();
            System.out.println(name + "-" + map.get(name));
        }

    }


}
