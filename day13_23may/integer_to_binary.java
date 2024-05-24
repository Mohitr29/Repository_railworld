package day13_23may;

public class integer_to_binary {
    public static void main(String[] args) {
        int number = 56;
        if (number < 0) {
            System.out.println("Negative numbers cannot represent binary.");
            return;
        }
        StringBuilder binary = new StringBuilder();

        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        System.out.println("Original value: " + number);
        System.out.println("Binary representation: " + binary);
    }

}
