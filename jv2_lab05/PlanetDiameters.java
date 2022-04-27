package lab05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PlanetDiameters {
    //array of planet's name
    private static final String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

    //Array of planets'diameter
    private static final float[] diameters = {4800f, 12103.6f, 12756.3f, 6794f, 142984f, 120536f, 51118f, 49532f, 2274f};

    public static void main(String[] args) {

        //Use map to store planet's names and their corresponding
        //diameters
        Map planets = new HashMap<>();

        //Add items (key, value) to the map

        for (int i = 0; i < names.length; i++)
            planets.put(names[i], diameters[i]);
        //Traverse the map
        Iterator it = planets.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + ": " + e.getValue());


        }
        System.out.println("------------------");

        while (true) {
            System.out.println("Find planet (ENTER to quit): ");
            String name = (new Scanner(System.in)).nextLine();
            if (name.length() == 0) break;
            if (!planets.containsKey(name))
                System.out.println("Planet " + name + " not found!");
            else
                System.out.println("THe diameter of " + name + " is" + planets.get(name));
        }
    }
}
