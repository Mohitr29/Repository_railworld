package day13_23may;

import java.util.Scanner;

public class GratestNum_user_scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter three numbers:");
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();

        int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);


        System.out.println("The greatest number is: " + greatest);

    }
}
