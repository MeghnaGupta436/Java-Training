package Day1_March27;
import java.util.Scanner;
public class NumberFactorial {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Enter a number");
        int num=sc.nextInt();//input number
        int fact=1;

        int i=num;
        while(i!=0){
            fact=fact*i;
            i--;
        }
        System.out.println("Factorial is: "+ fact);
    }
}
