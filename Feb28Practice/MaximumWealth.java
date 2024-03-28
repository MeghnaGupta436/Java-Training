package Feb28Practice;
import java.util.Scanner;
public class MaximumWealth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of person ");
        int person=sc.nextInt();
        System.out.println("Enter the number of bank accounts each hold ");
        int acc=sc.nextInt();

        int[][] arr=new int[person][acc];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the wealth of person: "+(i+1));
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The maximum wealth of person: "+calMaxWealth(arr));
    }
    public static int calMaxWealth(int[][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max)
              max=sum;
        }
        return max;

    }
}
