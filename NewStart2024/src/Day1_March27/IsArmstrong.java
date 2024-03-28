package Day1_March27;
import java.util.Scanner;
public class IsArmstrong{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a number");
        int number=sc.nextInt();//number entered by user
        int num=number;
        int rem=0,sum=0;

        while(num!=0){
            rem=num%10;
            sum+=(rem*rem*rem);
            num=num/10;
        }
        if(sum==number)
            System.out.println("Number is armstrong");
        else
            System.out.println("Not armstrong");
    }
}
