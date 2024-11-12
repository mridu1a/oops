 class Employee {
    String name;
    int age;
    float salary;

    public Employee(){
        this.age=0;
        this.name=null;
        this.salary=0.0f;
    }
    public Employee(String name, int age){
        this.name=name;
        this.age=age;
        this.salary=0.0f;
    }
    public Employee(String name, int age, float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("John", 25);
        Employee e3 = new Employee("John", 25, 50000.00f);

        e1.display();
        e2.display();
        e3.display();
    }
}
