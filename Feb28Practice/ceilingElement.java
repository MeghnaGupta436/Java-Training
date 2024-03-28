package Feb28Practice;
import java.util.Scanner;
public class ceilingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();// size of array

        int[] arr = new int[n];//declare array
        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); //input array elements
        }

        System.out.println("Enter the element you want to search");
        int target = sc.nextInt();// input target item

        //displaying the ceiling of a number
        System.out.println("Ceiling of target element is: " );

        boolean order=toCheckArrayOrder(arr);
        int start=0;
        int end=arr.length-1;
        if(order==true)
            System.out.println(findAscTargetCeiling(arr,target,start,end));
        else
            System.out.println(findDesTargetCeiling(arr,target,start,end));
    }
    //method to check if the array passed is ascending or descending
    public static boolean toCheckArrayOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[arr.length-1])
                return true; //returns true if Ascending
        }
        return false;//returns false if descending
    }

    public static int findAscTargetCeiling(int[] arr,int target,int start ,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target)
                start=mid+1;
            else if(arr[mid]>target)
                end=mid-1;
            else
                return mid;
        }
        return arr[start];

}
    public static int findDesTargetCeiling(int[] arr,int target,int start ,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<target)
                end=mid-1;
            else if(arr[mid]>target)
                start=mid+1;
            else
                return mid;
        }
        return arr[end];
    }
}




