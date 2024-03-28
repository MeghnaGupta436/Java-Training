package Feb15;
import java.util.*;
public class TrafficLight {
    String color;
    int duration;
    TrafficLight(String color, int duration) {
//        this.color = color;
        this.color = color;
        this.duration = duration;
    }
    public void toChangeColor(String newcolor){
        this.color=newcolor;
        System.out.println("changed color is "+color+"\n");
    }
    public boolean checkRed(){
        return color.equals("Red");
    }
    public boolean checkGreen(){
        return color.equals("Green");
    }
}
class Main1 {
    TrafficLight obj=new TrafficLight("Red",10);
    public void mainMenu(){

        System.out.println("Choose desired option: \n1.To Change Color " +
                "\n2.the Check if Red \n3.To check if Green");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println("Enter the new color you want to change");
                String newColor=sc.next();
                obj.toChangeColor(newColor);
                break;
            case 2:
                System.out.println(" Result: "+obj.checkRed());
                break;
            case 3:System.out.println(" Result: "+obj.checkGreen());
                break;
            default:
                System.out.println("Enter a valid choice");
        }
        mainMenu();
    }
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Main1 o = new Main1();
        o.mainMenu();
    }
}
