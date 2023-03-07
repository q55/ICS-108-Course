// file Lab10.java
/*
import java.util.ArrayList;

public class Lab10 {
    public static void main(String[] args) {
        ArrayList<Person> personList = createPersonList();
        printEmployees(personList);

        double avgsalary = avgSalary(personList);
        System.out.println("avg salary of = " + avgsalary);
        printStudents(personList);
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

    private static void printEmployees(ArrayList<Person> personList) {
        System.out.println("List of Employees");
        System.out.println("Name\tPhone\t\tID\tSalary");
        for (Person person : personList) {
            if (person instanceof Employee) {
                System.out.println(person.toString());
            }
        }
    }

    private static double avgSalary(ArrayList<Person> personList) {
        double sumSalary = 0.0;
        int numEmployees = 0;
        for (Person person : personList) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                sumSalary += employee.getSalary();//from the class of lab10 which was already written
                numEmployees++;
            }
        }
        return sumSalary / numEmployees;
    }

    private static void printStudents(ArrayList<Person> personList) {
        System.out.println("List of Students");
        System.out.println("Name\tPhone\t\tID\tGPA");
        for (Person person : personList) {
            if (person instanceof Student) {
                System.out.println(person.toString());
            }
        }
    }

    private static double avgGpa(ArrayList<Person> personList) {
        double sumGpa = 0.0;
        int numStudents = 0;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                sumGpa += student.getGpa();
                numStudents++;
            }
        }
        return sumGpa / numStudents;
    }
}

*/