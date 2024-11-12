
import java.util.*;

class Employee{
    public void display(){
        
        System.out.println("class name is employee");
    }
    public void calcSalary(){
        System.out.println("salary of employee is 10000");
    }


}
class Engineer extends Employee{
    public void display(){

        System.out.println("class name is engineer");
    }
    public void calcSalary(){
        System.out.println("salary is 20000");
    }
}
public class Inheritance{
    public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.display();
    e1.calcSalary();
    e1=new Engineer();
    e1.display();
    e1.calcSalary();
    }
}