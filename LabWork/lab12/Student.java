package lab12;

public abstract class Student {

    private int id;
    private double gpa;

    public Student(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public abstract String getStatus();

    @Override
    public final String toString() {
        return "Id: " + id + ", GPA: " + gpa + ", Status: " + getStatus();
    }
}

