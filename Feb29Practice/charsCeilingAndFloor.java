package Feb29Practice;
import java.util.Scanner;
import java.util.Arrays;

//to find the floor value of a target in an array entered by user
public class charsCeilingAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int s = sc.nextInt(); //input size

        char[] arr = new char[s];//declare array
        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0); //input array elements
        }
        System.out.println("Enter target element");
        char target = sc.next().charAt(0);

        boolean order=toCheckArrayOrder(arr);
        findCeilingAndFloor(arr,target,order);
        System.out.println("Ceiling and Floor value of target element is \n: "
                + Arrays.toString(findCeilingAndFloor(arr,target,order)));

    }
    public static boolean toCheckArrayOrder(char[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[arr.length-1])
                return true; //returns true if Ascending
        }
        return false;//returns false if descending
    }
    public static char[] findCeilingAndFloor(char[] arr,char target, boolean order){
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
                    return new char[]{(char) mid};
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
                    return new char[]{(char)mid};
            }
        }
        return new char[]{arr[start],arr[end]}; //returning the ceiling value and floor value
    }

}


