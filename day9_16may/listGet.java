package day9_16may;

import java.util.ArrayList;
import java.util.List;

public class listGet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Johnwick");
        list.add("mahima");
        list.add("jahnvi");
        String Index1 = list.get(1);
        System.out.println("Element at index 1: " + Index1);
    }
}
