package day7_14may;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean v = true;
        int i = 2;
        while (i <= n / 2) {

            if (n % 2 == 0) {
                v = false;
            }
            i++;
        }
        if (v == true) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");

        }

    }
}
