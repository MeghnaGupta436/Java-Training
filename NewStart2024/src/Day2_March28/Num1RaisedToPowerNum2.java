package Day2_March28;
import java.util.Scanner;
public class Num1RaisedToPowerNum2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int result=1;

        //number 1 raised to the power of number 2
        System.out.println("Enter 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for (int i = 1; i <= num2; i++) {
            result *= num1;//number will be multiplied by itself the number of times
             }

        System.out.println("number raised to the power number 2 is: "+ result
        );//displaying result
    }
}
