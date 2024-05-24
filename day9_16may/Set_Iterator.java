package day9_16may;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Iterator {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Johnny");
        set.add("ravi");
        set.add("sonu");

        Iterator<String> iterator = set.iterator();

        System.out.println("Elements in the set:");

        while (iterator.hasNext()) {

            String element = iterator.next();

            System.out.println(element);
        }
    }
}
