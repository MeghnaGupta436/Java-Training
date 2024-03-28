package Feb21;
import java.util.Scanner;
public class nthFibElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element you want");
        int n=sc.nextInt();

        int a=0;
        int b=1;
        int i=2;
        while(i<=n){
            int temp=b;
            b=a+b;
            a=temp;
            i++;
        }
        System.out.println(n+" element is: "+b);
    }
}
