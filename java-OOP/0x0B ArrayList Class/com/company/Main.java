package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);
        System.out.println("=-=-=---=-=");
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("=-=-=---=-=");
        // System.out.println(cars);
        // System.out.println(cars.get(0));
        // System.out.println(cars.size());

        cars.set(0, "Opel");
        System.out.println(cars);

        cars.remove(2);
        System.out.println(cars);
        cars.remove("Ford");
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());

    }
}
