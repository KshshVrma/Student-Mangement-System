
import java.util.*;
class Student{

    private int id;
    private String name;
    public  ArrayList<Course> courses=new ArrayList<Course>();
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;

    }
    public void enroll(Course cour){
        if(this.courses==null){
            this.courses=new ArrayList<Course>();
        }
        this.courses.add(cour);
        cour.Students.add(this.id);
    }

}