package Feb12.Practice;
import java.util.Scanner;
public class objects {
    String color;
    int age;

    objects(String color, int age) {
        this.color = color;
        this.age = age;
    }
}
class Main{
    public static void main(String[] args){
        method1("Black",24);
    }
    static public void method1(String color,int age) {
        objects obj = new objects(color, age);
        System.out.println("Color: " + obj.color + " Age: " + obj.age);
    }
}
