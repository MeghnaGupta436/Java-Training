package Feb21;
import java.util.Scanner;
public class IsLowerOrUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("The character is in lower case ");
        }
        else System.out.println("The character is in Upper case");
    }
}
