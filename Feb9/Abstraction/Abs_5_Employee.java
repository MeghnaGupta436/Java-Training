package Feb9.Abstraction;
import java.util.*;
public class Abs_5_Employee {
    public static void main(String[] args){
        Manager mng=new Manager(50000,"Manager of the company");
        Programmer prog=new Programmer(30000,"Programmer of company");

        System.out.println("Manager: Salary: "+ mng.calSalary()+" Information: "+ mng.displayInfo());
        System.out.println("Programmer: Salary: "+ prog.calSalary()+" Information: "+ prog.displayInfo());
    }
}
abstract class Employee{
    public abstract double calSalary();
    public abstract String displayInfo();
}
class Manager extends Employee{
    private double salary;
    private String Info;
    public Manager(double salary,String Info){
        this.salary=salary;
        this.Info=Info;
    }
    public double calSalary(){
        return salary;
    }
    public String displayInfo(){
        return Info;
    }
}
class Programmer extends Employee{
    private double salary;
    private String Info;
    public Programmer(double salary,String Info){
        this.salary=salary;
        this.Info=Info;
    }
    public double calSalary(){
        return salary;
    }
    public String displayInfo(){
        return Info;
    }
}
