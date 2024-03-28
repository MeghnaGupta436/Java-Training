package Feb27_Practice;
import java.util.Scanner;
public class LinearSearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // if item found in array then return the index
        System.out.println("Enter the number of elements in a array");
        int n=sc.nextInt();
        if (n==0)
        {
            System.out.println("-1");
            System.exit(0); //terminate if there is no array available
        }
        //otherwise return -1 if the element not found
        System.out.println("Enter the elements of the array");
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to find in the array");
        int item = sc.nextInt();
        int result=toFindItem(arr,item); //calling method
        System.out.println("(if not present, Index=-1) Index is:"+result); //displaying reult
    }
    public static int toFindItem(int arr[],int item) { //method to find item in an array

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==item) //check every element at every index if equals to item
                return i; //return index
        }
        //if none of the element is found to be same is item
        return -1;
    }

}

