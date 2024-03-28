package Feb29Practice;
import java.util.Scanner;
public class StartEndOfTargetOfAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int s = sc.nextInt(); //size of array

        int[] arr = new int[s];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt(); //input elements of array
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int start=tofindstartAndEnd(arr,target,true);
        int end=tofindstartAndEnd(arr,target,false);

        System.out.println("Start and end of target is: "+start+" "+end);

    }//checking for 1st occurance of target
    public static int ascStartEnd(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
    public static int tofindstartAndEnd(int[] arr,int target,boolean findStartIndex){
        int ans=-1;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else{
              ans=mid;
            if(findStartIndex)
                end=mid-1;
            else
                start=mid+1;}
        }
        return ans;
    }

}


