package Feb27_Practice;
import java.util.Scanner;
public class maxItemArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter an array");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum item in the array is: "+toCheckMax(arr));
        System.out.println("Minimum item in the array is: "+toCheckMin(arr,toCheckMax(arr)));
    }
    public static int toCheckMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int toCheckMin(int[] arr,int maxi){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        return min;
    }
}
