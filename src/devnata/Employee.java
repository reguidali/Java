package devnata;

public class Employee {
    protected String name; //protected allows to access in the child class.
    private int age;
    protected double salary;
    private String location;
    protected Department department;

    Employee(String name,int age, double salary,String location,Department department){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
        this.department = department;
    }

    public void raiseSalary(){
        double raise = 1.1;
        salary = salary * raise;
        System.out.println("Employee "+ this.name + " salary raised 10%");
        System.out.println("Salary is now " + this.salary);
    }

   public void printSalary(){
        System.out.println(this.name + " : " + this.salary);
    }
}
