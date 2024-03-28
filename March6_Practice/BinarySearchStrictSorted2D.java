package March6_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchStrictSorted2D {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};//matrix

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++) {
                System.out.print(matrix[row][col] +"  ");
            }
            System.out.println();
        }

        System.out.println("Enter the element you want to search");
        int target=scanner.nextInt();//target to be searched

        System.out.println("The index of the searched target is: "
                +Arrays.toString(toSearchTarget(matrix, target)));//displaying index of the searched element
    }
    //method to search for the target element in the array using binary search
    public static int[] toSearchTarget(int[][] matrix, int target)
    {
        int rowS = 0;
        while(matrix[rowS][matrix[0].length-1] < target)
            rowS++;

        for(int row=rowS;row<matrix.length;row++){

            int s = 0, e = matrix[0].length-1;
            int mid = s + (e-s)/2;
            while(s <= e) {

                if ( matrix[row][mid]==target)
                    return new int[]{row, mid};
                else if (matrix[row][mid] > target)
                    e = mid - 1;
                else
                    s=mid+1;
                mid = s + (e-s)/2;
            }
        }
        return new int[]{-1,-1}; //returning -1 if the target element is not found
    }
}
