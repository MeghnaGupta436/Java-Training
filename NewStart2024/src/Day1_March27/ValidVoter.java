package Day1_March27;
import java.util.Scanner;
public class ValidVoter {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter your age");
        int age=sc.nextInt();// input age

        if(age>18)
            System.out.println("valid voter");
        else
            System.out.println("Invalid voter");
    }
}
