package day11_20may;


interface Add_able {
    int add(int a, int b);
}

public class LemdaExpression01 {
    public static void main(String[] args) {


        Add_able ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));


        Add_able ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}
