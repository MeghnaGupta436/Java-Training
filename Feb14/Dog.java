package Feb14;
import java.util.*;
public class Dog {
    Scanner sc=new Scanner(System.in);
    private String name;
    private String breed;
    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getName(){return name;}
    public String getBreed(){return breed;}
    public static void main(String[] args){
        Dog d1=new Dog("oreo","pug");
        Dog d2=new Dog("Roxy","Husky");
        System.out.println("Name and breed of dog is: "+d1.name+"  "+d1.breed);
        System.out.println("Name and breed of dog 2 is: "+d2.name+" "+ d2.breed);
    }
}

