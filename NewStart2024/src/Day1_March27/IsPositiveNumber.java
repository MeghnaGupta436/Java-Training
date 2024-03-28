package Day1_March27;
import java.util.Scanner;
public class IsPositiveNumber {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a number");
        int num=sc.nextInt();

        if(num>0)
            System.out.println("Yes,Number is positive");
        else if(num<0)
            System.out.println("No,Number is negative");
        else
            System.out.println("No,Number is zero");
    }
}
