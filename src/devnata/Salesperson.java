package devnata;

public class Salesperson extends Employee{
    private double commissionPercentage;
    private static Department department = Department.SALES;

    public Salesperson(String name, int age, double salary, String location, Department department,double commission) {
        super(name, age, salary, location, department);
        this.commissionPercentage = commission;
    }

    public void raiseCommission(){
        commissionPercentage = commissionPercentage * 1.3;
        System.out.println("Congratulations, " + super.name);
        System.out.println("Your commission has raised! Commission is now " + this.commissionPercentage);
    }

}
