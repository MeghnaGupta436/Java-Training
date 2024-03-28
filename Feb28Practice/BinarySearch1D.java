package Feb28Practice;
import java.util.Scanner;
public class BinarySearch1D {
    //search for an item in 1D array using binary search
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int s=sc.nextInt(); //no. of elements
        System.out.println("Enter the elements of array: ");
        int[]arr=new int[s];
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();} //input elements of array

        System.out.println("Enter the element you want to search");
        int target =sc.nextInt(); //item to be searched

        //displaying the index of searched item
        System.out.println("Index of searched item is: "+(usingBinarySearch(arr,target)));
    }
    public static int usingBinarySearch(int[] arr,int target){
        int start=0; //start element
        int end=arr.length-1; //end element
       while(start<=end){ //test condition
           int mid=(start+end)/2;
            if(arr[mid]<target)
                start=mid+1; //searching right side of mid
            else if(arr[mid]>target)
                end=mid-1; //searching left side of mid
            else
                return mid; //returning index if the element is found
        }
        return -1; //if item not found
    }
}
