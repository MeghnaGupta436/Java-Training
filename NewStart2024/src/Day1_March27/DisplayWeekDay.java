package Day1_March27;
import java.util.Scanner;
public class DisplayWeekDay {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number in between 1-7");
        int day=sc.nextInt();//input day number

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Enter a valid choice");
        }
    }
}
