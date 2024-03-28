package Feb8.Encapsulation;
import java.util.*;
import java.util.ArrayList;
public class Encapstudent {
    public static void main(String[] args){

    }
}
class Student{
    private int studentId;
    private String stdName;
    private List<Double>grades =new ArrayList<Double>();

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getStudentName(){
        return stdName;
    }
    public void setStudentName(String stdName ){
        this.stdName=stdName;
    }
    public List < Double > getGrades() {
        return grades;
    }
    public void addGrade(double grades){
        ;

    }
}
