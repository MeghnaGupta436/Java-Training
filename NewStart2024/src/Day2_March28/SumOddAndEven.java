package Day2_March28;
import java.util.Scanner;
public class SumOddAndEven {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int SumEven=0,SumOdd=0;
        System.out.println("Enter the number of elements you want to enter");
        int n=sc.nextInt();

        int[] numbers=new int[n];
        System.out.println("Enter the numbers ");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(numbers[i]%2==0)
                SumEven+=numbers[i];
            else
                SumOdd+=numbers[i];
        }
        System.out.println("Sum of even numbers is: "+SumEven);
        System.out.println("Sum of odd numbers is: "+SumOdd);
    }
}
