package day10_17May;

import java.util.HashMap;
import java.util.Map;

public class get_map {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Kunal", 1);
        map.put("Madhav", 2);
        map.put("Nihal", 3);


        Integer appleValue = map.get("kavita");
        Integer bananaValue = map.get("Madhavi");
        Integer grapeValue = map.get("prem");

        // Print the retrieved values
        System.out.println("Value  with key 'kavita': " + appleValue);
        System.out.println("Value  with key 'Madhavi': " + bananaValue);
        System.out.println("Value  with key 'Prem': " + grapeValue);
    }
}
