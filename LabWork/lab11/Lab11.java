package lab11;

import java.util.ArrayList;

public class Lab11 {
    public static void main(String[] args) {
        ArrayList<Student> myList = new ArrayList<>();
        Undergraduate u1 = new Undergraduate(1001, "John Doe", 3.5, "555-1234", "JR");
        Undergraduate u2 = new Undergraduate(1002, "Jane Smith", 3.2, "555-5678", "SO");
        Undergraduate u3 = new Undergraduate(1003, "Bob Johnson", 3.9, "555-2468", "SR");

        // create some graduate students
        Graduate g1 = new Graduate(2001, "Mary Brown", 3.8, "555-1357", "Computer Science");
        Graduate g2 = new Graduate(2002, "Tom Wilson", 3.2, "555-2468", "Mathematics");

        // add students to the arraylist
        myList.add(u1);
        myList.add(u2);
        myList.add(u3);
        myList.add(g1);
        myList.add(g2);

        int count = 0, sum = 0;
        for (Student student : myList) {
            if (student instanceof Undergraduate) {
                System.out.println(student.toString());
                count++;
                sum += ((Undergraduate) student).getGPA();
            }
        }
        System.out.println("avgGpa is " + (sum / count));
        ////////
        count = 0;
        sum = 0;
        for (Student student : myList) {
            if (student instanceof Graduate) {
                System.out.println(student.toString());
                count++;
                sum += ((Graduate) student).getGPA();
            }
        }
        if (count > 0) {
            double averageGpa = sum / count;
            System.out.println("Average GPA for undergraduates: " + averageGpa);
        } else {
            System.out.println("No undergraduates found.");
        }
    }
}
