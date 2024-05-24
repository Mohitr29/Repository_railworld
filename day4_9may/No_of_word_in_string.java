package day4_9may;

public class No_of_word_in_string {
    public static void main(String[] args) {


        String str = "rohan is a bad boy";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (((i > 0) && (str.charAt(i) != ' ') && (str.charAt(i) == ' ')) || ((str.charAt(i) != ' ') && (i == 0))) {

                count++;
            }
        }
        System.out.println(count);

    }
}
