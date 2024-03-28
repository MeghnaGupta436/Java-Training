package Feb20;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class SelectOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("Enter your choice " +
                "\n1.Add(+) \n2.Subtract(-) " +
                "\n3.Multiply(*) \n4.Divide");
        int choice= sc.nextInt();
                switch(choice){
                    case 1: System.out.println(a+b);
                    break;
                    case 2: System.out.println(a-b);
                    break;
                    case 3: System.out.println(a*b);
                    break;
                    case 4: System.out.println(a/b);
                    break;
                    default: System.out.println("Enter a valid choice");
        }
    }
}
