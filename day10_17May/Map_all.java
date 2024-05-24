package day10_17May;

import java.util.HashMap;
import java.util.Map;

public class Map_all {
    public static void main(String[] args) {
        // Create the first HashMap
        Map<String, String> map1 = new HashMap<>();

        map1.put("one", "1");
        map1.put("two", "2");
        map1.put("three", "3");

        Map<String, String> map2 = new HashMap<>();

        map2.put("four", "4");
        map2.put("five", "5");


        System.out.println("Map1 before putAll: " + map1);
        System.out.println("Map2 before putAll: " + map2);

        // Use putAll to copy all mappings from map2 to map1
        map1.putAll(map2);

        // Print the maps after using putAll
        System.out.println("Map1 after putAll: " + map1);
        System.out.println("Map2 after putAll: " + map2);
    }
}
