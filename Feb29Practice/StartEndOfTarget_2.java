package Feb29Practice;
import java.util.Arrays;
import java.util.Scanner;
public class StartEndOfTarget_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int s = sc.nextInt(); //size of array

        int[] arr = new int[s];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();//input elements of array
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        int returnVal = toFind1stMidVal(arr, target);
        if (returnVal == -1)
            System.out.println("Target not found");
        else{
            System.out.println(findtargetStartAndEndIndex(arr,target,returnVal));
           // tofindTargetEndIndex(arr,target,returnVal);
        }
    }
    //to find the first Mid value of the array
    public static int toFind1stMidVal(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

       while(start<=end){
           mid=(start+end)-1;
           if(arr[mid]<target)
               start=mid+1;
           else if(arr[mid]>target)
               end=arr[mid]-1;
           else
               return mid;
       }
        return -1;
    }
    public static int findtargetStartAndEndIndex(int[] arr,int target,int mid){

        int ans=-1;
        int start=0;
        int end= mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]<target)
                start=mid+1;
            else if(arr[mid]>target)
                end=mid-1;
            else
                end=mid;
            ans=mid;
        }
        return ans;
    }

}
