package lab11;

public class Student {
    private int ID;
    private String name;
    private double GPA;
    private String phoneNum;

    public Student(int ID,String name,double GPA,String phoneNum){
        this.ID = ID;
        this.name = name;
        this.GPA = GPA;
        this.phoneNum = phoneNum;
    }
    public double getGPA(){
        return GPA;
    }


    public String toString(){
        return "ID" + ID + ", name"+name +", GPA" +GPA +". phoneNum" + phoneNum;
    }

}
