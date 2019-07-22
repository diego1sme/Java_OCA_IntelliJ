package test;
import java.util.*;
public class Rope {
    final static int x2 = 7;
    final static Integer x4= 8;
    public static void swing(){
        System.out.print("swing " );
    }
    public void climb(){
            System.out.println("climb");
    }
    public static void play(){
        swing();
        //climb();
    }
    public static void main(String[]args){
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        a.add("String"); a2.add("String");
        System.out.println(a.equals(a2));
        Integer x1 = 5;
        String s = "a";
        if(x1<9) s+= "b";
        switch(x1){
            case 5: s += "c";
            case x2: s+= "d";
            //case x4: s+= "e";
        }
        System.out.println(s);
    }
}
