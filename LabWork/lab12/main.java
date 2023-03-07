package lab12;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        ArrayList<Student> myList = new ArrayList<>();

        myList.add(new Graduate(2021857,3.7));
        myList.add(new Graduate(2021857,2));
        myList.add(new Undergraduate(2021857,4));
        myList.add(new Undergraduate(2021857,2.99));
        myList.add(new Undergraduate(2021857,1.8));


        for (Student i : myList){
            System.out.println(i);

        }


    }


}
