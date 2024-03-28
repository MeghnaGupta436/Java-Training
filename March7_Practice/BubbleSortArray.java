package March7_Practice;
import java.util.Scanner;
public class BubbleSortArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size=scanner.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements of array");
        for(int index=0;index<size;index++){
            arr[index]=scanner.nextInt();
        }
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=1;
            while(j< arr.length-i){
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                j++;
            }
        }
        return arr;
    }
}
