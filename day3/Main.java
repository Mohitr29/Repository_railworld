import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String s1 = new String("ride");
       System.out.println(s1 == s);

       String str = "john wick";
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'k') {                           // cahatAt method, string length method
           }
       }


       String a = "coperade";
        String b = "coperede";
        System.out.println(a.compareTo(b));                  // compairTo method method


        String strr = "hello";
        String str1 = "world";

        System.out.println(strr + str1);                          // String concatination method


        String a1 = "Hello";
        String a2 = "hello";

        System.out.println(a1.equalsIgnoreCase(a2));                // equalsIgnoreCase method



        String st = "Helo";
        String st1 = "helo";
        System.out.println(st.equals(st1));                         // equals method


        String neww = "hello this is railworld technologies";
        System.out.println(neww.indexOf("railworld"));                  // index of method





    }
}