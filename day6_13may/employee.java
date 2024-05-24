package day6_13may;

public class employee {
    void salary() {
        System.out.println("Salary= 200000");
    }
}

class Programmer extends employee {
    void bonus() {
        System.out.println("Bonus=50000");
    }
}

class singleInheritance {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        p.salary();
        p.bonus();
    }
}
