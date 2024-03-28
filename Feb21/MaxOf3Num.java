package Feb21;
import java. util.Scanner;
public class MaxOf3Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter three numbers to compare");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("The greatest number is: "+max);
    }
}
