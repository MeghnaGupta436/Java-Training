package day2;
import java.util.Scanner;
public class SumArrElements {
    public static void main(String[] args){
        int i,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int s= scanner.nextInt();
        int[] arr= new int[s];
        System.out.println("Enter "+s+" Elements ");
         for(i=0;i<s;i++)
         {
             arr[i]=scanner.nextInt();
         }
         for(i=0;i<s;i++) {
             sum = sum + arr[i];
         }
          System.out.println("sum of elements of array is "+ sum);
         }

    }


