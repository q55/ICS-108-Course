package lab12.Version2;

public abstract class Student {
    private String id;
    private double GPA;

    public Student(String id, double GPA){
        this.id = id;
        this.GPA = GPA;
    }

    public abstract String  getStatus();

    public final String toString(){
        return "ID : "+ id + ", GPA : " + GPA + ", staute : "+getStatus();
    }

}
