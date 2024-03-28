package Day1_March27;
import java.util.Scanner;
public class TableOfNumber {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Enter a number");
        int num=sc.nextInt();//entered number

        for(int i=1;i<=10;i++){

            System.out.println(num +" * "+i+" = "+ num*i);
        }
    }
}
