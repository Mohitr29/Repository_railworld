package day11_20may;



interface Speaker {
    public String say(String name);
}

public class LemdaExpressions {
    public static void main(String[] args) {


        Speaker s1 = (name) -> {
            return "Hello, " + name;
        };

        System.out.println(s1.say("Guys"));





    }
}
