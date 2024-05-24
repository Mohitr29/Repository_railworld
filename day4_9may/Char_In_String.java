package day4_9may;

public class Char_In_String {
    public static void main(String[] args) {
        String s = "anis is a good boy ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }

        }
        System.out.println(count)   ;
    }

}
