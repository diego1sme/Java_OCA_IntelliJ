package food;

interface AInterface{
    static void eat(){
        System.out.println("interface");
    }
}

class MyException extends Exception{

}
abstract class Abs{
    abstract void a(int i);
}
class Animal{
    public void eat() {
        System.out.println("animal");
    }
}
class Dog extends Animal{
    public void eat() {
        System.out.println("Dog");
    }
    public void eat(String s) {
        System.out.println("animal"+s);
    }
}

public class BadFoodException extends Abs implements AInterface{
    public static void eat(){
        System.out.println("method");
    }
    public static void main(String [] args){
        new BadFoodException().a(5);
        Animal animal = new Dog();
        animal.eat();
        AInterface.eat();
        Dog d = (Dog)animal;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                if(j == 1)
                    break;
                System.out.println(j);
            }
            System.out.println(i);
        }
        try{
            checkFood("chips");
        }catch (MyException m){
            m.printStackTrace();
        }
    }
    static String checkFood(String s) throws MyException{
       System.out.println(s);
        if(s.equals("chips")){
            throw new MyException();
        }
        return "y";
    }
    public void a(int i){
        System.out.println(i);
    }
}
