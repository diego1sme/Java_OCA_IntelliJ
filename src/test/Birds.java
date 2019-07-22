package test;
import java.util.*;
import java.util.function.Predicate;

public class Birds {
    Birds(int w, boolean talk){ounceWeight = w; canTalk = talk;}

    int ounceWeight;
    boolean canTalk;

    int getW(){return ounceWeight;}
    boolean getTalk(){return canTalk;}

    //public String toString(){return "" + getW() + " "+getTalk();}

    public static void main(String[] args){
        ArrayList<Birds> birds = new ArrayList<>();
        birds.add(new Birds(1,true));
        birds.add(new Birds(1,false));
        birds.add(new Birds(48,false));
        birds.add(new Birds(32,true));
        System.out.println("parrots: "+
                sorter(birds,b->b.getTalk()==true));
        System.out.println(" parrotlets: "+
                sorter(birds, b-> b.getTalk()==true
                && b.getW() <=2));
    }
    static ArrayList<Birds> sorter(ArrayList<Birds> blist,
                                   Predicate<Birds>expr){
        ArrayList<Birds> result = new ArrayList<>();
        for(Birds b: blist) {
            if (expr.test(b)) {
                result.add(b);
            }
        }
        return result;
    }
}
