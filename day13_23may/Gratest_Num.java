package day13_23may;

public class Gratest_Num {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;

        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The greatest number  is: " + greatest);
    }
}
