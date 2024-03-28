package Feb20;
import java.util.Scanner;
public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers to compare");
        float a= sc.nextFloat();
        float b=sc.nextFloat();
        if (a>b)
            System.out.println(a+" is greater than "+ b);
        else
            System.out.println(b+ " is greater than "+ a);
    }
}
