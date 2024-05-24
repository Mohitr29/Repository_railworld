package day13_23may;

public class Integer_to_binary_Array {
    public static void main(String[] args) {
        int number = 56;

        if (number < 0) {
            System.out.println("Negative numbers cannot represent binary");
            return;
        }


        int numBits = 32;
        int[] binaryArray = new int[numBits];


        int index = numBits - 1;
        while (number > 0) {
            binaryArray[index] = number % 2;
            number /= 2;
            index--;
        }


        System.out.println("value: " + number);
        System.out.print("Binary : ");
        for (int i = 0; i < numBits; i++) {
            System.out.print(binaryArray[i]);
        }
    }
}
