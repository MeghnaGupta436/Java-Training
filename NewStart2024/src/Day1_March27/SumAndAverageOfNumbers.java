package Day1_March27;
import java.util.Scanner;
public class SumAndAverageOfNumbers {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter five numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int sum= a+b+c+d+e; //finding sum
        int average=(a+b+c+d+e)/5; //finding average

        System.out.println("Sum is: "+ sum);
        System.out.println("Average is:"+average);
    }
}
