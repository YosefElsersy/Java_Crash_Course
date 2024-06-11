package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author yosef
 */
public class Main {

    public static void main(String[] args) {
        // HashMap<String, String> capitalCities = new HashMap<String, String>();
        // capitalCities.put("England", "London");
        // capitalCities.put("Germany", "Berlin");
        // capitalCities.put("Norway", "Oslo");
        // capitalCities.put("USA", "Washington DC");
        // capitalCities.put("Egypt", "Alex");

        // System.out.println("\n" + capitalCities);
        // System.out.println(capitalCities.size());
        // for (String string : capitalCities.keySet()) {
        // System.out.println("Key: "+string+"Value: "+capitalCities.get(string));
        // }
        // for (String string : capitalCities.values()) {
        // System.out.println(string);
        // }
        // System.out.println("\n" + capitalCities.remove("England"));
        // System.out.println("\n" + capitalCities.get("England"));
        // capitalCities.clear();
        // System.out.println("\n" + capitalCities);
        ArrayList<String> cars = new ArrayList<String>();
        System.out.println("\n=============================");
        cars.add("Volvo");
        cars.add("Camaro");
        cars.add("Lambo");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\n=============================");

    }

}
