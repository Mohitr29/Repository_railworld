package day9_16may;

import java.util.ArrayList;
import java.util.List;

public class List_To_Array {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Vanshika");
        list.add("samarth");
        list.add("ajay");


        String[] array = list.toArray(new String[list.size()]);
        System.out.println("Elements in the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
