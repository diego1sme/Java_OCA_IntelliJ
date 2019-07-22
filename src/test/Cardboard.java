package test;

public class Cardboard {
    Short story = 200;
    Cardboard go(Cardboard cb){
        cb = null;
        return cb;
    }
    public static void main(String [] args){
        Cardboard c1 = new Cardboard();
        Cardboard c2 = new Cardboard();
        Cardboard c3 = c1.go(c2);
        c1 = null;
        if(c2 == null) {
            System.out.println("null");
        }else{
            System.out.println("not null");
        }
    }
}
