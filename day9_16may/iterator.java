package day9_16may;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String elements="";
        list.add("Priya");
        list.add("vaibhav");
        list.add("deen");
        Iterator<String> iterator = list.iterator();

        System.out.println("Elements in the list:");
        while (iterator.hasNext()) {
            elements = iterator.next();
            System.out.println(elements);
        }

        list.remove("Priya");
        System.out.println("removing from list");
        System.out.println(elements);

    }
}
