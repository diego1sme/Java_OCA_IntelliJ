package test;

class MyException extends Exception{}
class Tire{
    void doStuff(){}
}

public class Retread extends Tire{
    public static void main(String [] args){
        new Retread().doStuff();
        String x = "big surprise";
        System.out.println(x.toString());
    }
    void doStuff() throws ArithmeticException{
        System.out.println(7);
    }
}
