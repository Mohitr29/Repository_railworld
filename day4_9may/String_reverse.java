package day4_9may;

public class String_reverse {
    public static void main(String[] args) {
        String str = "Rakesh,rohan";
        String revers = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revers = revers + str.charAt(i);

        }
        System.out.println(revers);
    }

}
