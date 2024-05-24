package day9_16may;

import java.util.ArrayList;
import java.util.List;

public class ListSet {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Harsh");
        list.add("lucky");
        list.add("raj");

        int listSize = list.size();

        System.out.println("List before set: " + list);
        System.out.println("List-size before set : " + listSize);
        list.set(1, "rakesh");
        listSize++;
        System.out.println("List after set: " + list);

        System.out.println("size after set: " + listSize);
    }
}
