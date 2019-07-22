package test;

class Employee{
    public void Salary(){
        System.out.println("set salary");
    }
}
class Manager extends Employee{
    public void Budget(){
        System.out.println("set budget");
    }
}
class Director extends Manager{
    public void StockOption(){
        System.out.println("set Stock");
    }
}

public class EmployeeTest {
    public static void main(String [] args){
        Employee e = new Employee();
        Employee e2 = new Manager();
        Employee e3 = new Director();
        e.Salary();
        e2.Salary();
        e3.Salary();
        //e2.Salary();
    }
}
