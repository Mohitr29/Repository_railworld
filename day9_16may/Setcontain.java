package day9_16may;

import java.util.HashSet;
import java.util.Set;

public class Setcontain {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Advik");
        set.add("Aahan");


        String elementToCheck = "Advik";


        if (set.contains(elementToCheck)) {
            System.out.println(elementToCheck + " is in the set.");
        } else {
            System.out.println(elementToCheck + " is not in the set.");
        }

    }

}
