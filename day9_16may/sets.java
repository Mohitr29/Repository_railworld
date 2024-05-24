package day9_16may;

import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set before clear: " + set);
        set.clear();
        System.out.println("Set after clear: " + set);
    }
}
