package Day1_March27;
import java.util.Scanner;
public class LeapYear {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a year");
        int year=sc.nextInt();// input year from user

        if(year%4==0 && year%400==0 || year%100!=0)
            System.out.println("Year is a leap year");

        else
            System.out.println("Not a leap year");
    }
}
