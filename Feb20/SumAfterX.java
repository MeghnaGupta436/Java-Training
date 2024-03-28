package Feb20;
import java.util.Scanner;
public class SumAfterX {
    public static <object> void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        char var=' ';
        int num,sum=0;
//        do{
//            int num = sc.nextInt();
//            sum += num;
//            System.out.println("Enter Char : " );
//             var = sc.next().charAt(0);
//        }while(var != 'x');
//        System.out.println(sum);
        num=sc.nextInt();
        while(var!='x'){
            sum=sum+num;
        }
        System.out.println("Sum is: " +sum);
    }
}
