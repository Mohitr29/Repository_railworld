package day11_20may;

interface able{
    public String say();
}

public class LemdaEcpressionnn {
    public static void main(String[] args) {
        able s=()->{
            return "this is expression";
        };
        System.out.println(s.say());
    }
}
