package day10_17May;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class may_key {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");


        Set<String> keys = map.keySet();


        System.out.println("The keys in the map are: " + keys);


        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
