package March6_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch2D_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8, }, {9,10, 11, 12}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the target you want to search");
        int target = scanner.nextInt();

        System.out.println(Arrays.toString(toSearchTarget(arr, target)));
    }

    public static int[] toSearchTarget(int[][]arr,int target){
        //initializing rows and columns
        int row=arr.length;
        int col=arr[0].length;

        int start=0;
        int end=(row*col)-1;
        int mid=start+(end-start)/2;

        while(start<=end){
            int element =arr[mid/col][mid%col];

            if(element == target){
                return new int[]{mid/col, mid%col};
            }
            if(element < target)
                start=mid+1;
            else if(element > target)
                end=mid-1;
            mid=start+(end-start)/2;
        }
        return new int[]{-1};
    }
}
