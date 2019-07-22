import food.Fruit;
public class Apple extends Fruit{
    public void go(){
        System.out.println("hello");
    }
    public static void main(String [] args){
        Apple a = new Apple();
        a.go();
    }
}
