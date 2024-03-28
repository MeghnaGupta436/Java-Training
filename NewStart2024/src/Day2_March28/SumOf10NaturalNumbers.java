package Day2_March28;
import java.util.Scanner;
public class SumOf10NaturalNumbers {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int sum=0;

        //to print the sum of 1st 10n natural numbers
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("Sum of 1st 10 natural numbers is: "+sum);
    }
}
