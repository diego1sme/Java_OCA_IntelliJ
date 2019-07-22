package test;
import food.Lamb2;
import food.Lamb2.*;

public class ArrayUsage extends Lamb2 {

    public static void main(String [] args){
        ArrayUsage au = new ArrayUsage();
        int [] a = new int[4];
        a[0] =4;
        a[a.length -1] = 4;
        System.out.print(a[0] + a[3]);
        if(a instanceof Object)
            System.out.print(" - Yes!");
        System.out.println(au.si);
        String s = null;
    }
}
