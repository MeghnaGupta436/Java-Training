package Feb20;
import java.util.Scanner;
public class GreetingMsg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name");
        String name=sc.nextLine();
        System.out.println("Hello " +name+" you are invited for my Birthday Party. " +
                "\n I hope you will be there to make my day more special" +
                "\n \nThankyou ");
    }
}
