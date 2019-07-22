package test;

class Animal{
    public void doStuff(){
        System.out.println("a");
    }
}
class Horse extends Animal{
    public void doStuff(){
        System.out.println("h");
    }
}

public class UseAnimals {
    public void doStuff(Animal a){
        System.out.println("In the Animal version");
    }
    public void doStuff(Horse h){
        System.out.println("In the Horse version");
    }

    public static void main(String [] args){
        UseAnimals ua = new UseAnimals();
        Animal animalObj = new Animal();
        Horse horseObj = new Horse();
        Animal animal2Obg = new Horse();
        //Horse horse2Obj = new Animal();
        ua.doStuff(animalObj);
        ua.doStuff(horseObj);
        ua.doStuff(animal2Obg);
        //ua.doStuff(horse2Obj);

       // ((Horse)a).doStuff();
    }

}
