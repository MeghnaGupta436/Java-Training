package Day1_March27;
import java.util.Scanner;
public class CheckPalindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Enter a number");
        int num=sc.nextInt();//number entered
        int reverse=0, rem=0;
        int n=num;

        //reverse a number
        while(n!=0) {
            rem= n % 10;
            reverse = (reverse*10)+rem;
            n=n/10;
        }

        if(num==reverse)
            System.out.println("Is Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
