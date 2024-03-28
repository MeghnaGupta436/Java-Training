package Day1_March27;
import java.util.Scanner;
public class EvenOrOdd {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Enter a number");
        int num=sc.nextInt();// number entered

        if(num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
