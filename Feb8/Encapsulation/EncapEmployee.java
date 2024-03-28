package Feb8.Encapsulation;
import java.util.*;
public class EncapEmployee {
    public static void main(String[] args){
        Employee obj=new Employee();

        obj.setEmpId(101);
        obj.setEmpName("Meghna");
        obj.setEmpSalary(200000);

        int empId=obj.getEmpId();
        String empName=obj.getEmpName();
        String empSalary=obj.getEmpSalary();

        System.out.println("Employee Id : "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary);
    }
}
class Employee{
    private int empId;
    private String empName;
    private double empSalary;

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public String getEmpSalary(){
        String str = Double.toString(empSalary);
        return str;
    }
    public void setEmpSalary(double empSalary){
        this.empSalary=empSalary;
    }
}
