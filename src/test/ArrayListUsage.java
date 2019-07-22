package test;
import java.util.*;
import java.time.*;
public class ArrayListUsage {
    public static void main(String [] args){
        List<String> list = new ArrayList<String>(2);
        System.out.print(list.size()+" ");
        list.clear();
        System.out.print(list.size()+" ");
        list.add("Hey!");
        list.add("Howdy!!");
        list.add(2,"Hello!!!");
        int [] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers,7));
        LocalDateTime now = LocalDateTime.now();
        now = now.plusHours(2);
        //Period p = new Period.of(0,1,1);

        System.out.println(now);
    }
}
