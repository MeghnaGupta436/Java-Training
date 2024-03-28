package Feb28Practice;
import java.util.Scanner;
public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns");
        int col=sc.nextInt();

        int[][] arr=new int[row][col]; //declaring 2D array
        System.out.println("Enter the elements of array");
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
        arr[r][c]=sc.nextInt(); //input elements in array
            }
        }

    }
}
