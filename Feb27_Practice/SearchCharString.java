package Feb27_Practice;
import java.util.Scanner;
public class SearchCharString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        if(str.length()==0){
            System.out.println("Enter valid string");
            System.exit(0);}
        System.out.println("Enter the item you want to find in String");
        char item = sc.next().charAt(0);

        System.out.println("(if item not found Index=-1)\n" +
                "The index of charater is: "+toFindItem(str,item));
    }
    public static int toFindItem(String str, char item){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==item)
                return i;
        }
        return -1;
    }
}
