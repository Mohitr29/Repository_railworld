package day2_7thMay;
import java.util.Scanner;
public class Nested_ternery {
    public static void main(String[] args) {

        // take input from users
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        // ternary operator checks if
        // marks is greater than 40
        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");
        input.close();
    }
}
