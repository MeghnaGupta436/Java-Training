package Feb12.Practice;
import java.beans.Customizer;
import java.util.Scanner;
public class Data {
    String name;
    int age;
    public static void main(String[] args){
        Data obj=new Data();
    }
    public void putvalue(String a, int b){
        name=a;
        age=b;
    }
    public void display(){
        System.out.println("Name and Age is : ");
    }
}

