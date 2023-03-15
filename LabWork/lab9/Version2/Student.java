package lab9.Version2;

public class Student extends Person{
    private String id;
    private double GPA;

    public Student(String name, String phoneNum, String id, double GPA) {
        super(name, phoneNum);
        this.id = id;
        this.GPA = GPA;
    }
    public double getGPA(){
        return GPA;
    }
    public void setGPA(int GPA){
        this.GPA = GPA;
    }
    public String toString(){
        return super.toString() +", ID: "+id+", GPA: "+GPA;
    }
}
