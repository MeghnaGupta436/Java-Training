package March4;
import java.util.Scanner;
public class SearchMountainArrayTarget {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size of array");
        int s=sc.nextInt(); //input size of array

        int[] arr=new int[s];
        System.out.println("Enter the elements of array");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt(); //input elements of array
        }
        System.out.println("Enter the target element: ");
        int target=sc.nextInt(); //to input target element

        int peak=toSearchPeak(arr);
        int ascTarget=toFindAscTarget(arr,target,peak);
        if(ascTarget!=-1)
            System.out.println("Target index is: "+ascTarget);
        else
        {int desTarget=toFindDesTarget(arr,target,peak);
        if(desTarget!=-1)
            System.out.println("Target is:"+desTarget);
        else
            System.out.println("Target not found");
        }
    }
    //to search the maximum element in array
    public static int toSearchPeak(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<end) //loop halting condition
        {
            mid=start+(end-start)/2; //finding mid

            if(arr[mid]<arr[mid+1])
                start=mid+1; //when mid is less than next element
            else
                end=mid; //when mid is greater than next element
        }
        return end; // when start will be equal to end
    }
    //to find the Target in ascensing order before the max element
    public static int toFindAscTarget(int[] arr,int target,int peak){
        int start=0;
        int end= peak;
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
        return -1;
    }
    //to find the target element in descending order after maximum element
    public static int toFindDesTarget(int[] arr,int target,int peak){
        int start=peak+1;
        int end= arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]<target)
                end=mid-1;
            else if(arr[mid]>target)
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
