package Feb20;
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float principle,rate,time;
        System.out.println("Enter Principle ,Rate and Time " +
                "\n to find the Simple Intrest");
        principle=sc.nextFloat();
        rate = sc.nextFloat();
        time = sc.nextFloat();

        float simInt=(principle*rate*time)/100;
        System.out.println("Simple Interest is: "+ simInt);
    }
}
