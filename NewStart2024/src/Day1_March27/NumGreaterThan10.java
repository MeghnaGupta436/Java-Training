package Day1_March27;
import java.util.Scanner;
public class NumGreaterThan10 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a number");
        int num=sc.nextInt();

        if(num>10)
            System.out.println("Number is greater than 10");
        else
            System.out.println("Number is not greater than 10");
    }
}
