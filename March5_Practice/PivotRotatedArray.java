package March5_Practice;
import java.util.Scanner;

public class PivotRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element you want to search in array");
        int target=sc.nextInt();

        int[] arr = {4, 5, 6, 7, 0, 1, 2};//rotated Array having distinct elements
        int indexPivot=toFindPivot(arr); //pivot element index
        if(leftSearchPivot(arr,target,indexPivot)!=-1)
            System.out.println("Target found at index: "+leftSearchPivot(arr,target,indexPivot));
        else if(rightSearchPivot(arr,target,indexPivot)!=-1)
            System.out.println("Target found at index: "+rightSearchPivot(arr,target,indexPivot));
        else
            System.out.println("Target not found");
    }

    public static int toFindPivot(int[] arr) //finding pivot element in array
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2; //to find mid
            if (arr[mid] > arr[mid + 1]) //case 1
                return mid;
            else if (mid<end && arr[mid] < arr[mid - 1]) //case 2
                return mid-1;
            else if (start >= mid)//case 3
                end = mid-1;
            else  //case 4
                start = mid + 1;
        }
        return -1; //if none case is found
    }
    //to search target at the left of the pivot element
    public static int leftSearchPivot(int[] arr, int target, int indexPivot){
        int start=0;
        int end=indexPivot;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]<target)
                start=mid+1;
            else if(arr[mid]>target)
                end=mid-1;
            else
                return mid;
        }
        return -1;// if target not found
    }
    //to search target at the right of the pivot element
    public static int rightSearchPivot(int[] arr, int target, int indexPivot){
        int start=indexPivot+1;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]<target)
                start=mid+1;
            else if(arr[mid]>target)
                end=mid-1;
            else
                return mid;
        }
        return -1;// if target not found
    }
}
