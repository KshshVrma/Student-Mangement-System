class Mangement{
    public static void main(String[] args){
        Course dsa=new Course(1, "DSA");
        Course design= new Course(2, "Design");
        Course Apti=new Course(3,"Aptitude");

        Professor A= new Professor(1, "A");
        Professor B= new Professor(2, "B");
        Professor C= new Professor(3, "C");

        Student one=new Student(1, "one");
        Student two=new Student(2, "two");
        Student three=new Student(3, "three");
        Student four=new Student(4, "four");
        Student five=new Student(5, "five");
        Student six=new Student(6, "six");

        A.Lecture(dsa);
        B.Lecture(design);
        C.Lecture(Apti);

        one.enroll(dsa);
        one.enroll(design);

        two.enroll(design);
        three.enroll(Apti);
        four.enroll(dsa);
        five.enroll(design);
        six.enroll(dsa);
        six.enroll(design);
        six.enroll(Apti);
        System.out.println(dsa.Students);
        System.out.println(dsa.professor);




    }
}