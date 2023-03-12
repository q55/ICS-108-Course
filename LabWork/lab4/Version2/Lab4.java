package lab4.Version2;

import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        final int MAX = 10;
        int sum = 0;
        ArrayList<Integer> myList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int objNum = input.nextInt();
        System.out.print("Enter the weights of the objects: ");

        for (int i=0;i<objNum;i++){
        myList.add(input.nextInt());
        }

        boolean valide = true;
        int listNumber = 0;
        while (valide ){
            ArrayList<Integer> countener = new ArrayList<>();
            listNumber++;
            for (Integer num:myList) {
                if (sum + num <= MAX) {
                countener.add(num);
                sum +=num;
                }
                }
            sum = 0;
            for (Integer num:countener){
                myList.remove(num);
            }
            System.out.println("Container "+ listNumber +" contains objects with weight"+countener);
            if (myList.size() == 0){
                valide =false;
        }
        }
    }
}