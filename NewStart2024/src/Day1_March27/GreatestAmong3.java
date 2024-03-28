package Day1_March27;
import java.util.Scanner;
public class GreatestAmong3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the three numbers you want to compare");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();// input three values

        if (num1>num2) {
            if(num1>num3)
            System.out.println(num1+"  is greatest");
            else
                System.out.println(num3+"  is greatest");
        }
        else if (num2>num3)
            System.out.println(num2+"  is greatest");
        else
            System.out.println(num3+"  is greatest");
    }
}
