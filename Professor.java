class Professor{
    private int id;
    private String name;

    public Professor(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void Lecture(Course course){
        course.professor=this.id;
    }
}