package Feb27_Practice;
import java.util.Scanner;
//number of items having even digits
public class ArrayCountEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();

        int[] arr = new int[s];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt(); //input elements of array

        }
        int evenCount = 0;
        for (int i = 0; i < s; i++) {
            int num = arr[i];
            int count = 0;
            while (num > 0) {
                num /= 10;
                count++;
            }
            if (count % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("the number of items having even digits are: "+evenCount);

    }
}

