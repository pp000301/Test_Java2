package collektions;

import java.util.*;

public class collection_test {

    public static void main(String[] args) {
        List<String> persons= new ArrayList<String>();// Обьявление коллекции String

        persons.add("Natalia");// Добавление в коллекцию
        persons.add("Sergey");
        persons.add("Yurii");
        persons.add("Konstantin");//kasjkdjksajdksjakdjsd

        persons.set(2,"Igor");// замена 2 элемента коллекции .... индексация в колекциях с нуля

        // Вывод упорядоченной коллекции коллекции

        for (int i = 0; i <persons.size() ; i++) {

            System.out.println(persons.get(i));

        }

        // Работа с не упорядоченными коллекциями (не индексированными)
        System.out.println("Не индексированная коллекция");
        Collection<String> names=persons;// Получаем ссылку
        Iterator<String> iter= names.iterator();// Передаем ссылку в итератор класс

        //Вывод не индексированной коллекции

        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        System.out.println("Второй вариант вывода неиндексированной коллекции");

        for (String name: names) {
            System.out.println(name);
        }

        }
    }

