
import java.util.*;
class Student{

    private int id;
    private String name;
    ArrayList<Course> courses;
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;

    }
    public void enroll(Course cour){
        this.course.add(cour);
        cour.Students.add(this.id);
    }

}