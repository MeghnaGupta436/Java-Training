package Day2_March28;
import java.util.Scanner;
public class ReverseNumbers {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int rem=0,rev=0;
        System.out.println("Enter a number");
        int num=sc.nextInt(); //number entered by user

        //to reverse a number
        while(num!=0){
            rem=num%10; //gives remainder
            rev=(rev*10)+rem; //gives reverse
            num=num/10; //updates number
        }
        System.out.println("Number reversed: "+rev);// displays result
    }
}
