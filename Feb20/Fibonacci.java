package Feb20;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.print("Fibonacci Series: "+a +","+b);

        for(int i=3;i<=n;i++){
            int next=a+b;
            a=b;
            b=next;
            System.out.print(","+next);
        }

    }
}
