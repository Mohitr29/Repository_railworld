package day10_17May;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class entrysets {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Abhishek", 1);
        map.put("Chirag", 2);
        map.put("drishti", 3);


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();


        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
