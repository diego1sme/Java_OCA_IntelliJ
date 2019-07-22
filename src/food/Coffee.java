package food;
import java.util.*;
class A{

}

enum CoffeeSize{
    BIG(8),MEGA(10),STUPID(12){
        public String getLidCode(){
            return "A";
        }
    };
    CoffeeSize(int oz){
        this.oz = oz;
    }
    private int oz;
    public int getOz(){
        return oz;
    }
    public String getLidCode() {
        return "B";
    }
}


public class Coffee {
    CoffeeSize size;
    public static void main(String [] args){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        a.add("a");
        a2.add("a");
        System.out.println(a == a2);
        System.out.println(a.equals(a2));


        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.BIG;

        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.STUPID;

        System.out.println(drink2.size.getOz());
        for(CoffeeSize cs: CoffeeSize.values())
            System.out.println(cs + " "+ cs.getOz()+" "+cs.getLidCode());
    }
}
