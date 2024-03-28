package Feb29Practice;
import java.util.Arrays;
import java.util.Scanner;

//to find the floor value of a target in an array entered by user
public class CeilingAndFloorOfTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int s = sc.nextInt(); //input size

        int[] arr = new int[s];//declare array
        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); //input array elements
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();

        boolean order=toCheckArrayOrder(arr);
        findCeilingAndFloor(arr,target,order);
        System.out.println("Ceiling and Floor value of target element is \n: "
                + Arrays.toString(findCeilingAndFloor(arr,target,order)));

    }
    public static boolean toCheckArrayOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[arr.length-1])
                return true; //returns true if Ascending
        }
        return false;//returns false if descending
    }
    public static int[] findCeilingAndFloor(int[] arr,int target, boolean order){
        int start,end,mid=0;
        if(order==true) // array is in ascending order
        {
            start=0;
            end=arr.length-1;
            while(start<=end)
            {
                mid=(start+end)/2;
                if(arr[mid]<target)
                    start=mid+1;
                else if(arr[mid]>target)
                    end=mid-1;
                else
                    return new int[]{mid};
            }
        }
        else //array is in descending order
        {  start=arr.length-1;
            end=0;
            while (end <= start)
            {
                mid = (start + end) / 2;
                if (arr[mid] < target)
                    start = mid - 1;
                else if (arr[mid] > target)
                    end = mid + 1;
                else
                    return new int[]{mid};
            }
        }
        return new int[]{arr[end],arr[start]}; //returning the ceiling value and floor value
    }

}

