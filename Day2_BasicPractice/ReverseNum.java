package Day2_BasicPractice;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        int num,rev=0,rem;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        num=scanner.nextInt();
        while(num>0)
        {
            rem = num% 10;
            rev = (rev*10) + rem;
            num = num/ 10;
        }
        System.out.println("The reverse of number is "+ rev);
    }
}
