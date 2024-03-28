package March5_Practice;
import java.util.Scanner;
public class CountRotationArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={4,5,6,7,0,1,2};
        int pivot=toFindPivot(arr);
        if(pivot!=-1)
            System.out.println("Number of rotations are: "+(pivot+1));
        else
            System.out.println("Number of rotations are: 0");
    }
    public static int toFindPivot(int[] arr)
    {
        int start =0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2; //to find mid

            if (mid>start && arr[mid]>arr[mid + 1]) //case 1
                return mid;
            else if (mid<end && arr[mid]<arr[mid-1]) //case 2
                return mid-1;
            else if (arr[start]>=arr[mid])//case 3
                end = mid-1;
            else //case 4
                start = mid + 1;
        }
        return -1;
    }
}
