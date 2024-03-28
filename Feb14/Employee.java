package Feb14;
import java.util.*;
public class Employee {
    static Scanner sc = new Scanner(System.in);

    public static class EmployeeSalary {
        String name;
        String jobTitle;
        double salary;

        EmployeeSalary(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

//        public String getName() {
//            return name;
//        }
//
//        public String getJobTitle() {
//            return jobTitle;
//        }

//        public double getSalary() {
//            return salary;
//        }

//        public void setName() {
//            this.name = name;
//        }
//        public void setJobTitle() {
//            this.jobTitle = jobTitle;
//        }
//        public void setSalary() {
//            this.salary = salary;
//        }
        public double calSalary(double salary) {
            System.out.println("Enter your working days in a month ");
            int days = sc.nextInt();
            double monthSal = days * salary;
            return monthSal;
        }
        public void updateSalary(double UpSalary) {
            this.salary=UpSalary;
//            calSalary(salary);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter Job Title");
        String jobTitle = sc.nextLine();
        System.out.println("Enter your salary per day" );
        double salary = sc.nextDouble();
        EmployeeSalary emp = new EmployeeSalary(name, jobTitle, salary);
        System.out.println("Enter your choice: \n1.Calculate Salary \n2.Update Salary");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Calculated salary is: " + emp.calSalary(salary));
                break;
            case 2:
                System.out.println("Enter updated salary");
                double UpSalary=sc.nextDouble();
                emp.updateSalary(UpSalary);
                System.out.println("Updated salary is: "+emp.calSalary(emp.salary));
                break;
            default:
                System.out.println("Enter a valid choice");
        }
    }
}

