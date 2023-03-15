package lab10.Version2;

// file Lab10.java
import java.util.ArrayList;
public class Lab10 {
    public static void main(String[] args) {
        ArrayList<Person> personList = createPersonList();
//1. This method prints the employees only
        printEmployees(personList);
//2. This method finds the average salary of employees
        double avgSalary = avgSalary(personList);
        System.out.println("avg salary of = " + avgSalary);
//3. This method prints the students only
        printStudents(personList);
//4. This method finds the average GPA of students
        double avgGpa = avgGpa(personList);
        System.out.println("avg GPA of students = " + avgGpa);
    }

    private static ArrayList<Person> createPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Employee("Saad", "0563428255", 200003, 16000));
        personList.add(new Student("Reem", "0564448202", 20000, 3.6));
        personList.add(new Employee("Salem", "0501331845", 200001, 9000));
        personList.add(new Student("Hasan", "0594448202", 20002, 2.8));
        return personList;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static void printEmployees(ArrayList<Person> personList) {
        System.out.println("List of Employees");
        for (Person person : personList) {
            if (person instanceof Employee) {
                System.out.println(person);
            }
        }
    }
    public static double avgSalary(ArrayList<Person> myList){
        int count = 0;
        double sum =0;
        for(Person person:myList){
            if(person instanceof Employee){
                count ++;
                sum += ((Employee) person).getSalary();
            }
        }
        return sum/count;
    }
    public static void printStudents(ArrayList<Person> myList){
        for(Person person:myList){
            if(person instanceof Student){
                System.out.println(person);
            }
        }
    }
    public static double avgGpa(ArrayList<Person> myList){
        int count = 0;
        double sum =0;
        for(Person person:myList){
            if(person instanceof Student){
                count ++;
                sum += ((Student) person).getGpa();
            }
        }
        return sum/count;
    }
}

