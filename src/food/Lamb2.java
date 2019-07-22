package food;

import java.util.function.Predicate;

public class Lamb2 {
    protected String si = "hello";
    public static void main(String [] args){
        Lamb2 m1 = new Lamb2();
        m1.go((Lamb2 x)->adder(2,3) > 7);
    }
    void go(Predicate<Lamb2> e){
        Lamb2 m2 =new Lamb2();
        System.out.println(e.test(m2) ? "ternary true"
                : "ternary false");
    }
    static int adder(int x, int y){return x+y;}
}
