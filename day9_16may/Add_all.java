package day9_16may;

import java.util.HashSet;
import java.util.Set;

public class Add_all {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Set 1 before addAll: " + set1);
        System.out.println("Set 2: " + set2);

        set1.addAll(set2);
        System.out.println("Set 1 after addAll: " + set1);
    }
}
