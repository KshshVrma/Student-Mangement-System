import java.util.ArrayList;
class Course{

    private int id;
    private String name;
    public ArrayList<Integer> Students;
    public int professor;
    public Course(int id, String name){
        this.id=id;
        this.name=name;
        if(this.Students==null){
            this.Students=new ArrayList<Integer>();
        }
    }
    public void setName(String name){
        this.name=name;
    }

}