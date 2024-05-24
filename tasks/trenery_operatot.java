import java.util.Scanner;

public class trenery_operatot {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();
        System.out.println("enter 3rd number");
        int n3 = sc.nextInt();
        int max;

        max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

        // Print the largest number
        System.out.println("Largest number is "+ max );
    }
}