package day10_17May;

import java.util.HashMap;
import java.util.Map;

public class map_Put {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Prateek", 1);
        map.put("dev", 2);
        map.put("jeet", 3);

        System.out.println("Original map: " + map);
        map.put("Sujal", 4);

        map.put("Tarun", 5);
        System.out.println("Updated map: " + map);
    }
}
