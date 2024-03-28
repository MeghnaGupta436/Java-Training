package March5_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows and columns of an sorted 2D array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of array");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("Enter the element you want to search");
        int target=sc.nextInt();
        System.out.println( Arrays.toString(toFindTarget(arr,target)));
    }
    public static int[] toFindTarget(int[][] arr,int target) {
        for (int row = 0; row <= arr.length-1; row++) {
            for (int col = 0; col <=arr[row].length; col++) {
                if (arr[row][col] < target)
                    col++;
                else if (arr[row][col] > target)
                {row++;
                col--;}
                else
                    return new int[]{row, col};
            }
        }
        return new int[]{-1,-1};
    }
}
