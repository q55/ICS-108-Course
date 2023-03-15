package lab9.Version2;

public class Employee extends Person {
    private String id;
    private int monhtlySalary;

    public Employee(String name, String phoneNum, String id, int monhtlySalary) {
        super(name, phoneNum);
        this.id = id;
        this.monhtlySalary = monhtlySalary;
    }

    public int getMonhtlySalary() {
        return monhtlySalary;
    }

    public void setMonhtlySalary(int monhtlySalary) {
        this.monhtlySalary = monhtlySalary;
    }
    public String toString(){
        return super.toString() + ", ID: "+id+", Monthly salary: "+monhtlySalary+" SAR";
    }
}
