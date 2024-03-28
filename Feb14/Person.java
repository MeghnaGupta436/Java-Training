package Feb14;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Person {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1=new Person("Meghna",24);
        Person person2=new Person("Vanshika",22);
        System.out.println("The name and age of person 1 is: \n"+person1.getName() +"  "+person1.getAge());
        System.out.println("The name and age of person 2 is: \n" +person2.getName()+"  "+person2.getAge());
    }
}