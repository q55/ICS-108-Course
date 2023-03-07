package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        int numberOfObjects;
        ArrayList <Integer> list = new ArrayList<>();
        boolean valide = true;
        Container c1 = new Container(10);

        System.out.println("Enter the number of objects: ");
        Scanner sc = new Scanner(System.in);
        numberOfObjects = sc.nextInt();

        System.out.println("Enter the weights of the objects: ");
        for (int i = 0; i<numberOfObjects; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list.toString());
        while (valide){
            //for ()

        }

    }


}
