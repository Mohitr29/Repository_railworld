package day10_17May;

import java.util.HashMap;
import java.util.Map;

public class Map_value {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");


        String value = "2";
        if (map.containsValue(value)) {
            System.out.println("The map contains the value: " + value);
        } else {
            System.out.println("The map does not contain the value: " + value);
        }
    }
}
