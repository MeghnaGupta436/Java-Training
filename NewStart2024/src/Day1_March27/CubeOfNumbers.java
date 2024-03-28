package Day1_March27;
import java.util.Scanner;
public class CubeOfNumbers {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a number");
        int n=sc.nextInt(); //input number
        System.out.println("Cubes upto "+n +" : ");

        for(int i=1;i<=n;i++){
            int cube=i*i*i;
            System.out.println(cube);
        }
    }
}