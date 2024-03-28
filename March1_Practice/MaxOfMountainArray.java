package March1_Practice;
import java.util.Scanner;
public class MaxOfMountainArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size=sc.nextInt(); //size of array

        int[] arr=new int[size];// declaring array
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt(); //input elements to an array
        }
         //calling function to find largest in mountain array
        System.out.println("the largest of mountain array is:\n "
                +toFindLargest(arr));
    }

    public static int toFindLargest(int[] arr){
        int start=0; //initializing start with 0
        int end=arr.length-1; //end is length -1
        int mid=0; //initializing mid to 0 , to avoid garbage value

        while(start<end) //halting condition
        {
            mid=start+(end-start)/2;//calculating mid

            if(arr[mid]<arr[mid+1])//checking if the mid element is less than next one
                start=mid+1; //updating start by moving right
            else
                end=mid;//if the mid element is greater than its next element we will move left
        }
        return arr[start]; /*returning the element at start or at end
        as at the end the largest element will be present at position where
        start will be equal to end */
    }
}