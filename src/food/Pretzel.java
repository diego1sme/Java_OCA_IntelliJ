package food;

class Food{
    Food doStuff(){
        return new Food();
    }
}

public class Pretzel extends Food{
    Pretzel doStuff(){
        return new Pretzel();
    }
    public static void main(String [] args){
        Pretzel p = new Pretzel();
        Food f = new Food();
        System.out.println(p.doStuff());
        System.out.println(f.doStuff());
    }
}
