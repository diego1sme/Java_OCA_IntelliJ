package test;
import java.util.*;
import java.lang.StringBuilder;
import java.time.*;

interface CanFly{
    String type = "A";
    void fly();
    default String getType(){
        return type;
    }

}
interface Runnable{
    public void run();
}

public class TestClass {
    Runnable run = ()->System.out.println("Run");
    public static void main(String [] args){
        //int array[] = new int[-2];
        System.out.println(LocalTime.now());
        StringBuilder sb = new StringBuilder("1Zo");
        System.out.println(sb);
        List<String> items = new ArrayList<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Box");
        for(String i: items){
            if (i.indexOf("P")  == 0) {
                continue;
            }else{
                System.out.print(i+" ");
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(21);list.add(13);
        list.add(30); list.add(11);list.add(2);
        list.removeIf(e->e%2 == 0);
        System.out.println(list);
        float i = 4;
        float j = 2;
        double z = i+j;
        System.out.println(z);
        Integer number = Integer.valueOf("808");
        System.out.println(number);
        print(1,2,3,4);
    }
    static void print(int x, int y, int z, int a){
        System.out.println(x+""+y+""+z+""+a);
    }
}
