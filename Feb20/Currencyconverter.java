package Feb20;
import java.util.Scanner;
public class Currencyconverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in Indian Rupee");
        float rupee=sc.nextFloat();
        float dollar;
        dollar=(float)(rupee*0.012);//1 rupee=0.012 dollars
        System.out.println("In dollars: "+dollar);
    }
}
