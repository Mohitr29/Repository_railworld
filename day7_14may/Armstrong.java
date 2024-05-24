package day7_14may;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int Number1, remainder, result = 0, n = 0;

        Number1 = number;

        for (; Number1 != 0; Number1 /= 10, ++n) ;

        Number1 = number;

        for (; Number1 != 0; Number1 /= 10) {
            remainder = Number1 % 10;
            result += Math.pow(remainder, n);
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }
}
