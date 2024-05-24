package day9_16may;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("nidhi");
        list.add("ram");
        list.add("zudio");
        System.out.println("List after adding elements: " + list);

        list.add("naman");


        System.out.println("List after adding naman: " + list);
    }
}
