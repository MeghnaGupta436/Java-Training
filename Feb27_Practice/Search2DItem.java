package Feb27_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Search2DItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of rows of array");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns of array");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols]; //declaring 2D array

        System.out.println("Enter the elements of array");
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt(); //input 2D array
            }
        }
        System.out.println("Enter the item you want to search");
        int item = sc.nextInt();
        int[] ans = toSearchItem(arr, item);// format of return value (row and column)
        System.out.println("The index of the item is: " + Arrays.toString(ans));
    }
    public static int[] toSearchItem(int[][] arr, int item) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == item)
                    return new int[]{r, c};
            }
        }
        return new int[]{-1,-1};
    }
}

