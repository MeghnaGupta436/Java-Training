package Day1_March27;
import java.util.Scanner;
public class NumberOfDaysInMonth {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the month in between 1-12");
        int month=sc.nextInt();// month entered by user

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("The number of days are: 31");
                break;
            case 2: case 4: case 6: case 9: case 11:
                System.out.println("The number of days are: 30");
        }
    }

}
