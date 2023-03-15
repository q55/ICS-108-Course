package lab12.Version2;

import java.util.ArrayList;

public class Lab12 {
    public static void main(String[] args) {
        ArrayList<Student> myList= new ArrayList<>();
        myList.add(new Undergraduate("1",2.8));
        myList.add(new Undergraduate("2",4));
        myList.add(new Graduate("3",2.8));
        myList.add(new Graduate("4",4));
        myList.add(new Graduate("5",1));

        for(Student sub:myList){
            System.out.println(sub);
        }
    }
}