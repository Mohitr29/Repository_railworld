package day4_9may;

public class palendromeString {

    public static void main(String[] args) {

        String s = "madam";
        String palindrome = "";

        int  a = s.length()-1;
        for(int i = a; i>=0; i--){

            palindrome = palindrome + s.charAt(i);


        }
        if(s.equals(palindrome)){
            System.out.println(" The Given String Is Palindrome :"+"\n"+palindrome);
        }else {
            System.out.println(" The Given String Is NOT A Palindrome ");
        }
    }
}
