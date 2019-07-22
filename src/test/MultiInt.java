package test;

interface I1{
    default int doStuff(){ return 1; }
}
interface I2{
    default int doStuff(){return 2;}
}
public class MultiInt implements I1,I2 {
    public static void main(String [] args){
        new MultiInt().go();
        float f = 234.56F;
        short s = (short)f;
        System.out.println(s);
        System.out.println(((true & false) == (false | true)));
        String a = "5";
        String b = "5";
        if(a.equals(b))
            System.out.println(b);

        a = "bye";
        System.out.println(a);
        outer:
            for(int age = 0; age <= 21; age++){
                if(age == 16){
                    System.out.println("get your driver's license "+age);
                    continue outer;
                }
                System.out.println("Another year "+age);
        }
    }
    void go(){
        System.out.println(doStuff());
    }
    public int doStuff(){
        return 3;
    }
}
