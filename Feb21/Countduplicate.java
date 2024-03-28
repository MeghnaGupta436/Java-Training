package Feb21;
import java.util.Scanner;
public class Countduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter the number  ");
//        long num=sc.nextInt();
//        System.out.println("Enter the digit you want to find ");
//        int n=sc.nextInt();
//        int count=0;
//        while(num>0){
//            long rem=num%10;
//            num=num/10;
//            if(rem==n)
//            {count++;}
//
//        }
//        System.out.println(n+" is presented "+count +" number of times");
        int rev=0;
        int rem=0;
        System.out.println("Enter a number you want to reverse");
        int num=sc.nextInt();

        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse of a number is "+rev);
    }
}
