package test;
import java.util.*;
class Special{
    private StringBuilder s = new StringBuilder("bob");
    StringBuilder getName(){
        //StringBuilder s2 = new StringBuilder(s);
        return new StringBuilder(s);
    }
    void printName(){System.out.println(s);}
}
public class A {
    static int y;
    {y =5;}
    public static void main(String [] args){
        ArrayList<String> s = new ArrayList<>();
        s.add("a guy");s.add("another guy");s.add("some stranger");
        System.out.println("hello fuck boy"+ y);
        A a = new A();
        a.go(s);
        int [] testScores;
        testScores = new int[]{4,7,2};
        System.out.println(testScores[1]);
        Special sp = new Special();
        StringBuilder s2 = sp.getName();
        s2.append("fred");
        sp.printName();
    }
    void go(ArrayList<String> st){
        System.out.println(y);
        for(String s: st)
            System.out.println(s);
    }
}
